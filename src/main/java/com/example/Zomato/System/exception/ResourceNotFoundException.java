package com.example.Zomato.System.exception;

public class ResourceNotFoundException extends RuntimeException{
    String resource;
   public  ResourceNotFoundException(String resource){
        this.resource=resource;
    }
    @Override
    public String getMessage(){
        return resource+" not found";
    }
}
