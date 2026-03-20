package com.example.Zomato.System.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionhandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException resourceNotFoundException){
        return new ResponseEntity<>(resourceNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String>  handleException(Exception ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(InsufficientInventoryException.class)
    public ResponseEntity<String> handleInsufficientInventory(InsufficientInventoryException ie){
        return new ResponseEntity<>(ie.getMessage(),HttpStatus.BAD_REQUEST);
    }
}
