package com.login.loginexample.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String Hello()
    {
        return "hello";
    }

    public String saveUser()
    {
        return "user saved";
    }
}
