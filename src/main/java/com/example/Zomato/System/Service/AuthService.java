package com.example.Zomato.System.Service;

import com.example.Zomato.System.entity.User;
import com.example.Zomato.System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    UserRepository userRepository;
    public String authenticate(User user){
        User u = userRepository.findByUsername(user.getUsername());
        if(u==null){
            return "failed";
        }
        if(user.getPassword().equals(u.getPassword())){
            return "Authentification successfull";
        }
        return "failed";
    }
}
