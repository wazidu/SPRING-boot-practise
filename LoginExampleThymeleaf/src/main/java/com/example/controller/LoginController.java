package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Wazid Ullah Murad on 5/8/2020.
 */
@Controller
public class LoginController {

        @RequestMapping(value = "/", method = RequestMethod.GET)
                public String getWelcome(Model model)
        {
            return "index";
        }

        @RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
        public  String getLogin(@ModelAttribute(name = "loginForm") LoginForm loginForm,Model model)
        {
           String username=loginForm.getUsername();
           String password=loginForm.getPassword();

            if ("admin".equals(username) && "admin".equals(password) ) {
                return "home";
            }
            model.addAttribute("invalidcredentials",true);
            return "login";
        }
}
