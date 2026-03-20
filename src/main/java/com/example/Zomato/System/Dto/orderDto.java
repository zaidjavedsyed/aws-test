package com.example.Zomato.System.Dto;

public class orderDto {
    Integer id;
    String status;
    String menuitem;
    int price;
    String name;
    int qt;

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public orderDto(String status, String menuitem, int price, String name, int qt, String phone) {
        this.status = status;
        this.menuitem = menuitem;
        this.price = price;
        this.name = name;
        this.qt = qt;
        this.phone = phone;
    }

    public String getMenuitem() {
        return menuitem;
    }

    public void setMenuitem(String menuitem) {
        this.menuitem = menuitem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    String phone;

    public orderDto(Integer id, String status, String menuitem, int price, String name, String phone) {
        this.id = id;
        this.status = status;
        this.menuitem = menuitem;
        this.price = price;
        this.name = name;
        this.phone = phone;
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
}
