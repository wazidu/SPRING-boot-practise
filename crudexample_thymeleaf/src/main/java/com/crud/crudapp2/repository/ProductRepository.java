package com.crud.crudapp2.repository;

import com.crud.crudapp2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
