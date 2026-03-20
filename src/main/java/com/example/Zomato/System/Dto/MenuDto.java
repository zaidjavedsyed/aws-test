package com.example.Zomato.System.Dto;

public class MenuDto {
    private String itemname;
    private int price;
    public String getItemname() {
        return itemname;
    }

    public MenuDto(String itemname, int price) {
        this.itemname = itemname;
        this.price = price;
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
}
