package com.example.Zomato.System.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String itemname;
    private int price;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public MenuItem(String itemname, int price, int quantity) {
        this.itemname = itemname;
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public MenuItem() {
    }

    public MenuItem(String itemname, int price) {
        this.itemname = itemname;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Restraunt getRestraunts() {
        return restraunts;
    }

    public void setRestraunts(Restraunt restraunts) {
        this.restraunts = restraunts;
    }

    @OneToMany(mappedBy = "menuItems")
    List<Order> orders;
    @ManyToOne
    Restraunt restraunts;

}
