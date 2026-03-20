package com.example.Zomato.System.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Restraunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String restrauntname;
    String address;
    @OneToMany(mappedBy = "restraunts")
    List<MenuItem> menuItems;

    public Restraunt(String restrauntname, String address) {
        this.restrauntname = restrauntname;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRestrauntname() {
        return restrauntname;
    }

    public void setRestrauntname(String restrauntname) {
        this.restrauntname = restrauntname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Restraunt() {
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
