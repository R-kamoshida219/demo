package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.domain.Questionnaire;
import com.example.demo2.form.Ex17QuestionnaireForm;


@Controller
@RequestMapping("/questionnaire")
public class Ex17QuestionnaireController {

    @RequestMapping("")
    public String index(Model model){

        Map<Integer,String>genderMap = new LinkedHashMap<>();
        genderMap.put(1, "男性");
        genderMap.put(2, "女性");
        model.addAttribute("genderMap",genderMap);


        Map<Integer,String>hobbyMap =new LinkedHashMap<>();
        hobbyMap.put(1,"野球");
        hobbyMap.put(2,"サッカー");
        hobbyMap.put(3,"テニス");
        model.addAttribute("hobbyMap", hobbyMap);

        Map<Integer,String>languageMap = new LinkedHashMap<>();
        languageMap.put(1,"Java");
        languageMap.put(2,"SQL");
        languageMap.put(3,"HTML&CSS");
        model.addAttribute("languageMap", languageMap);


        return "questionnaire/ex-17-input";
    }

    @RequestMapping("/create")
    public String create(Ex17QuestionnaireForm form,RedirectAttributes redirectAttributes){
        
        Questionnaire user = new Questionnaire();
        
        BeanUtils.copyProperties(form, user);

        List<String> genderList = new ArrayList<>();
        for(Integer genderCode : form.getGenderList()){
            switch(genderCode){

                case 1:
                  genderList.add("男性");
                  break;

                  case 2:
                  genderList.add("女性");
                  break;
            }
        }
        user.setGenderList(genderList);


        List<String> hobbyList = new ArrayList<>();
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



        List<String> languageList = new ArrayList<>();
        for(Integer languageCode : form.getLanguageList()){
            switch(languageCode){

                case 1:
                  languageList.add("Java");
                  break;

                  case 2:
                  languageList.add("SQL");
                  break;

                  case 3:
                  languageList.add("HTML&CSS");
                  break;
            }
        }
        user.setLanguageList(languageList);


        redirectAttributes.addFlashAttribute("user",user);
            return "redirect:/questionnaire/toresult";
        }

        @RequestMapping("/result")
            public String toresult(){
            return "questionnaire/ex-17-result";
        }

    }
