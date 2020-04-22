package com.crud.crudapp2.service;

import com.crud.crudapp2.entity.Product;
import com.crud.crudapp2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    public ProductRepository repo;

    public void save(Product product)
    {
        repo.save(product);
    }

    public List<Product> listAll()
    {
        return repo.findAll();
    }

    public Product get(int id)
    {
        return repo.findById(id).get();
    }

    public void delete(int id)
    {

        repo.deleteById(id);
    }
}
