package com.example.Zomato.System.repository;

import com.example.Zomato.System.entity.Restraunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

public interface RestrauntRepository extends JpaRepository<Restraunt, Integer> {
}
