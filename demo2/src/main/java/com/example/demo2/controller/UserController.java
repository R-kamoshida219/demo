package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Binding;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.example.demo2.domain.User;
import com.example.demo2.form.UserForm;
import com.example.demo2.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("")
    public String index(Model model){

        Map<Integer,String>hobbyMap = new LinkedHashMap<>();

        hobbyMap.put(1,"野球");
        hobbyMap.put(2,"サッカー");
        hobbyMap.put(3,"テニス");

        model.addAttribute("hobbyMap", hobbyMap);

        return "user/input";
    } 

    @ModelAttribute
    public UserForm setUpForm(){
        return new UserForm();
    }

    @RequestMapping("/create")
    public String create(@Validated UserForm form //リクエストパラメータを取得→バリエーションが動くようにアノテーションを追加
                         ,BindingResult result    //エラーメッセージが格納されるオブジェクトオブジェクト
                         ,RedirectAttributes redirectAttributes //flashスコープを使用するための準備
                         ,Model model             //requestスコープを使用するための準備
        ){

            if(result.hasErrors()){
                return index(model);
            }
            User user = new User();

            BeanUtils.copyProperties(form, user); //型が同じならコピーできる


            List<String> hobbyList = new ArrayList<>(); //上記でコピーされなかった、hobbyListは手動で、コピー
            for(Integer hobbyCode : form.getHobbyList()){
                switch(hobbyCode){

                case 1:
                hobbyList.add("野球");
                break;

                case 2:
                hobbyList.add("サッカー");
                break;

                case 3:
                hobbyList.add("テニス");
                break;
            }
            }
            user.setHobbyList(hobbyList);

            UserService userService = new UserService();//実際の業務処理[ユーザ登録をする]サービスクラスを呼びだし
            user = userService.save(user);

            redirectAttributes.addFlashAttribute("user",user);//flashスコープに格納する
            return "redirect:/user/toresult";    //登録完了画面にフォワードするメソッドにリダイレクト
    }

    @RequestMapping("/toresult") //登録完了画面へフォワード　@return 登録完了画面
    public String toresult(){
        return "user/result";
        //登録完了画面にフォワード
    }



    
}
