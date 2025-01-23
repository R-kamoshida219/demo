package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("/index") //リダイレクト処理
    public String index(){
        return "redirect:/hello/index2";  
      //return "redirect:/コントローラーを呼ぶパス/メソッドを呼ぶパス
    }

    @RequestMapping("/index2") //リダイレクト後に呼ばれるメソッド
    public String index2(){
        return "hello-world"; //ここはフォワード処理
    }
}
