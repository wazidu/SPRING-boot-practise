package com.example.springjpa2.entity;

/**
 * Created by Wazid Ullah Murad on 11/1/2019.
 */
public class Student {

    private String name;
    private String dept;
    private  String phone;

    public Student(String name, String dept, String phone) {
        this.name = name;
        this.dept = dept;
        this.phone = phone;
    }
    public Student(){}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
