package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/practice")
public class PracticeController {

@RequestMapping("")
public String practice(String num1, String num2){

    return "practice-form";
}

@RequestMapping("/calc")
public String inputNum(String num1,String num2,Model model){

int result1 = Integer.parseInt(num1);
int result2 = Integer.parseInt(num2);
int totalNum = result1 + result2; 

model.addAttribute("sum", totalNum);
return "result-practice";
}
}
