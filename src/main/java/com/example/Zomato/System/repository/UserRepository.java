package com.example.Zomato.System.repository;

import com.example.Zomato.System.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByUsername(String username);
}
