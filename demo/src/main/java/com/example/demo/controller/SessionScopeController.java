package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/session-scope")
public class SessionScopeController {

//sessionスコープを使うための設定
@Autowired
private HttpSession session; //フィールド変数を用意→import


   @RequestMapping("")
   //入力画面にフォワード（遷移）
    public String index(){
    return "session-scope-form";    // session-scope-form.htmlの画面を出すには（””）のURLが必要
}

  @RequestMapping("/input-name")
  //sessionスコープに名前nameというキーをつけて格納

  public String inputName(String name){       //フォームクラスを作り、そっちで受けとっても良い(nameは入力欄のname属性の名称と一致させる)
  session.setAttribute("name", name);    //キー名の"name"は自分の好きな名称にしてよい
  //page1へフォワード(遷移)
  return"result-session-scope1";
}

@RequestMapping("/to-page1")
public String toPage1(){
    //Page1画面にフォワード
    return "result-session-scope1";
}

@RequestMapping("/to-page2")
public String toPage2(){
    //Page2画面にフォワード
    return "result-session-scope2";
}

 @RequestMapping("/to-page3")
 public String toPage3(){
//Page3画面にフォワード
return "result-session-scope3";
}


}
