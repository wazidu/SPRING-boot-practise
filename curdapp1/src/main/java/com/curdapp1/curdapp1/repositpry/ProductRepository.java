package com.curdapp1.curdapp1.repositpry;

import com.curdapp1.curdapp1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
