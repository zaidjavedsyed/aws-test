package com.example.Zomato.System.entity;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public Customer() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;
}
