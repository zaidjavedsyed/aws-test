package com.example.Zomato.System.repository;

import com.example.Zomato.System.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
