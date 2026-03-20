package com.example.Zomato.System.Controller;

import com.example.Zomato.System.Service.AuthService;
import com.example.Zomato.System.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthService authService;
    @PostMapping("/authenticate")
  public String authenticate(@RequestBody User user){
    return authService.authenticate(user);
    }

}
