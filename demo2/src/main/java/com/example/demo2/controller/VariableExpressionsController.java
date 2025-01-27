package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo2.domain.Car; //異なるパッケージなのでimportする

@Controller
@RequestMapping("/variable-expressions")
public class VariableExpressionsController {

    @RequestMapping("")
    public String index(Model model){

    model.addAttribute("name","鴨志田亮太");
    Car car = new Car(100,"ベンツ",50);
    model.addAttribute("car",car);

    return "variable-expressions";
}
}
