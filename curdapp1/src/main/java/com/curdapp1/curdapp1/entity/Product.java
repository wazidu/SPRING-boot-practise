package com.curdapp1.curdapp1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
    @Id
    @GeneratedValue
    public int id;
    public String name;
    public  int quantity;
    public int price;

//    public Product(){}
//
//    public Product(int id, int name, int quantity, int price) {
//        this.id = id;
//        this.name = name;
//        this.quantity = quantity;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name=" + name +
//                ", quantity=" + quantity +
//                ", price=" + price +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getName() {
//        return name;
//    }
//
//    public void setName(int name) {
//        this.name = name;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
}
