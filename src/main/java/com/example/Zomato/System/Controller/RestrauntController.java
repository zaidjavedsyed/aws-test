package com.example.Zomato.System.Controller;

import com.example.Zomato.System.Dto.MenuDto;
import com.example.Zomato.System.Service.RestrauntService;
import com.example.Zomato.System.entity.Customer;
import com.example.Zomato.System.entity.MenuItem;
import com.example.Zomato.System.entity.Restraunt;
import com.example.Zomato.System.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restraunt")
public class RestrauntController {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    RestrauntService restrauntService;
    @PostMapping("/registercustomer")
    public void register(@RequestBody Customer customer){
        customerRepository.save(customer);
    }
    @PostMapping("/createrestraunt")
    public void createRestraunt(@RequestBody Restraunt restraunt){
        restrauntService.addRestraunt(restraunt);
    }
    @GetMapping("/viewrestraunts")
    public List<String> viewRestraunts(){
    return restrauntService.viewRestraunts();
    }
    @GetMapping("/viewmenuitem/{r_id}")
    public List<MenuDto> menu(@PathVariable int r_id){
        return restrauntService.viewMenuItem(r_id);
    }

}
