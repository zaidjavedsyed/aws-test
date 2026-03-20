package com.example.Zomato.System.Controller;

import com.example.Zomato.System.Service.MenuService;
import com.example.Zomato.System.entity.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/item")
@RestController
public class MenuController {
    @Autowired
    MenuService menuService;
    @PostMapping("/add/{r_id}")
    public void addItem(@RequestBody MenuItem menuItem,@PathVariable int r_id){
        menuService.addItem(menuItem,r_id);
    }

}
