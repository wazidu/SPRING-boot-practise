package com.example.springhibernateconnection_1.controller;

import com.example.springhibernateconnection_1.dao.StudentDao;
import com.example.springhibernateconnection_1.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//import static com.example.springhibernateconnection_1.dao.StudentDao.*;

/**
 * Created by Wazid Ullah Murad on 11/2/2019.
 */
@Controller
public class HomeController {

    @Autowired
    public StudentDao studentDao;
    @GetMapping("/home")
    public String getHome(Model model)
    {
        List<Student> list;
        list= (List<Student>) studentDao.findAll();
        model.addAttribute("stuList",list);
        return  "home";

    }


    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") Integer studentId)
    {
        System.out.println("its for deleting rows");


        Student student = studentDao.findById(studentId).get();
        studentDao.delete(student);
        //studentDao.deleteStu(studentId);

        return "redirect:/home";
    }


    //    @Autowired
//    public StudentDao studentDao;
//    @GetMapping("/home")
//    public String getHome(Model model){
//
//        List<Student> list ;
//        list = (List<Student>) studentDao.findAll();
//         model.addAttribute("stuList", list);
//            return "home";
//    }
    // for saving value from frontend

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String saveData(@RequestParam String name, @RequestParam String des)
    {
        studentDao.save(new Student(name, des));
        return "redirect:/home";
    }
}
