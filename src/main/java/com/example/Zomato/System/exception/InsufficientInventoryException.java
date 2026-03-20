package com.example.Zomato.System.exception;

public class InsufficientInventoryException extends RuntimeException{
    @Override
    public String getMessage(){
        return "Not enough stock";
    }
}
