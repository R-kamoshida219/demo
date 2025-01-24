package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/Login")
public class LoginController {
    
@Autowired
private HttpSession session;


@RequestMapping("")
public String Login(String mail,String pass){ //Viewの入力画面からリクエストを受け取り、フォワード(遷移)
    return "Login-form";
    }

@RequestMapping("/true")
public String True(String mail,String pass){

session.setAttribute("address",mail);
session.setAttribute("key", pass);

if(mail.equals("test@example.com") && pass.equals("123")){
return "Login-Result";
}else{
return "Login-form";
}
}

@RequestMapping("/mypage")
public String myPage(){

String address = (String) session.getAttribute("address");
String pass    = (String) session.getAttribute("key");

if(address == null && pass == null){
return "Login-form";
}else{
return "Login-Mypage";
}
}
}
