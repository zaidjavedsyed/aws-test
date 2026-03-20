package com.example.Zomato.System.Service;

import com.example.Zomato.System.Dto.MenuDto;
import com.example.Zomato.System.entity.MenuItem;
import com.example.Zomato.System.entity.Restraunt;
import com.example.Zomato.System.exception.ResourceNotFoundException;
import com.example.Zomato.System.repository.RestrauntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestrauntService {
    @Autowired
    RestrauntRepository repository;
    public void addRestraunt(Restraunt restraunt){
        repository.save(restraunt);
    }
    public List<MenuDto> viewMenuItem(int r_id){
        if(!repository.findById(r_id).isPresent()){
            throw new ResourceNotFoundException("Restraunt ");
        }
        return repository.findById(r_id).get().getMenuItems().stream().map((a)->new MenuDto(a.getItemname(),a.getPrice())).toList();
    }
    public List<String> viewRestraunts(){
        return repository.findAll().stream().map(restraunt -> restraunt.getRestrauntname()).toList();
    }
}
