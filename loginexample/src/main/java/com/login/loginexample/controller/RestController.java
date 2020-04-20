package com.login.loginexample.controller;

import com.login.loginexample.entity.User;
import com.login.loginexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    public UserService service;
    @GetMapping("/")
    public String Hello()
    {
        return "hello";
    }
    @GetMapping("/save-user")
    public String saveUser(@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age,@RequestParam String password)
    {
        User user=new User(firstname,lastname,age,password);
        service.saveMyUser(user);
        return "user saved";
    }
}
