package com.login.loginexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {


    @GetMapping("/welcome")
    public String getwelcome(Model model)
    {
        return  "welcome";
    }


}
