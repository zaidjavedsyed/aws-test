package com.example.Zomato.System.repository;

import com.example.Zomato.System.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
