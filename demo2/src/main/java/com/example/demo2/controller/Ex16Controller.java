package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/comm")
public class Ex16Controller {

    @Autowired
    private ServletContext application;

    @RequestMapping("")
    public String index(){

        List<String> list = new ArrayList<>();

        list.add("name1");
        list.add("com1");
        list.add("name2");
        list.add("com2");

      


     return "ex-16";
    }

    @RequestMapping("/chat")
    public String post(){


        return "ex-16";
    }

}
