package com.example.formy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
    @RequestMapping("/goods")
    public String index(Model model){
        model.addAttribute("msg","hello,springboot");
        return "goods.html";
    }
}
