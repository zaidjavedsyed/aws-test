package com.example.Zomato.System.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String status;

    public Order() {
    }

    @ManyToOne
    Customer customer;
    int qt;

    public Order(String status, int qt) {
        this.status = status;
        this.qt = qt;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public Order(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public MenuItem getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem menuItems) {
        this.menuItems = menuItems;
    }

    @ManyToOne
    MenuItem menuItems;

}
