package com.example.Zomato.System.Service;

import com.example.Zomato.System.entity.MenuItem;
import com.example.Zomato.System.entity.Restraunt;
import com.example.Zomato.System.exception.ResourceNotFoundException;
import com.example.Zomato.System.repository.MenuItemRepository;
import com.example.Zomato.System.repository.RestrauntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuService {
    @Autowired
    RestrauntRepository repository;
@Autowired
    MenuItemRepository menuItemRepo;

public void addItem(MenuItem menuItem,int r_id){
    if(!repository.findById(r_id).isPresent()){
        throw new ResourceNotFoundException("Restraunt ");
    }
    menuItem.setRestraunts(repository.findById(r_id).get());
    menuItemRepo.save(menuItem);
}

}
