package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Car;

@Controller
@RequestMapping("/if-unless")
public class IfUnlessController {

    @RequestMapping("")
    public String index(Model model){
        // 車に60km/hをセット
        Car car = new Car();
        car.setSpeed(60);

        // requestスコープにCarオブジェクトをセット
        model.addAttribute("hoge",car);

        // 結果画面にフォワード
        return "if-unless";
    }
}
