package com.curdapp1.curdapp1.controller;

import com.curdapp1.curdapp1.entity.Product;
import com.curdapp1.curdapp1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    public ProductService service;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product)
    {
        return service.saveProduct(product);
    }
    @PostMapping("/addproducts")
    public List<Product> addProducts(List<Product> products)
    {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts()
    {
        return service.getProducts();
    }
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id)
    {
        return service.getProductById(id);
    }
    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable String name)
    {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product)
    {
        return service.modifyProduct(product);

    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return service.deleteProduct(id);
    }

}
