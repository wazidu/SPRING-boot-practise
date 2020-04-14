package com.example.springjpa2.controller;

import com.example.springjpa2.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wazid Ullah Murad on 11/1/2019.
 */
@Controller
public class HomeController {
    @GetMapping("/home")
    public String getHome(Model model){

        List<Student> list= new ArrayList<>();

        list.add(new Student("Murad", "ICT","016"));
        list.add(new Student("mamun","ICT","017"));
        list.add(new Student("manna","ICT","018"));
        list.add(new Student("ismayel","ICT","019"));

        model.addAttribute("name","Name: Wazid Ullah Murad");
        model.addAttribute("dept","Dept: ICT");
        model.addAttribute("phone","phone: 01685222158");
        model.addAttribute("mylist",list);

        return "home";
    }
}
