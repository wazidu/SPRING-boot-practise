package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Wazid Ullah Murad on 5/15/2020.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model)
    {
        return "index";
    }

    @RequestMapping("/myaccount")
    public String myAccount()
    {
        return "myAccount";
    }


}
