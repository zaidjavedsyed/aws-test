package com.example.Zomato.System.repository;

import com.example.Zomato.System.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem,Integer> {
}
