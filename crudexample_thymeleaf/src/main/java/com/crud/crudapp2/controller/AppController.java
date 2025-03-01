package com.crud.crudapp2.controller;

import com.crud.crudapp2.entity.Product;
import com.crud.crudapp2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    public ProductService service;

@RequestMapping("/home")
public String getHome(Model model)
{
    List<Product> list;
    list=(List<Product>) service.listAll();
    model.addAttribute("plist",list);
    return "index";

}

    @RequestMapping("/new")
    public String newProduct(Model model)
    {
        Product product=new Product();
        model.addAttribute("product",product);
        return "new_product";


    }
    //by requestparam
//    @RequestMapping(value = "/save",method = RequestMethod.POST)
//    public String saveProduct(@RequestParam String name,@RequestParam String brand, @RequestParam float price)
//    {
//        Product product=new Product(name,brand,price);
//        service.save(product);
//        return "redirect:/home";
//    }

    //we can do the avobe operation simply by the following
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product) {
        service.save(product);

        return "redirect:/home";
    }
}
