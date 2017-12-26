package com.an.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginConterll {

    @GetMapping("/login")
    public String login(){
        System.out.println("hh");
        return "login";
    }
    @GetMapping("/index")
    public String index(){
        System.out.println("hh");
        return "index";
    }
}
