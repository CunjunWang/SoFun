package com.cunjunwang.sofun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by CunjunWang on 2018/11/3.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/404")
    public String pageNotFound(){
        return "404";
    }

    @GetMapping("/403")
    public String notAuthorized(){
        return "403";
    }

    @GetMapping("/500")
    public String internalServerError(){
        return "500";
    }

    @GetMapping("/logout")
    public String logoutPage(){
        return "logout";
    }
}