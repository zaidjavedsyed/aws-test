package com.example.Zomato.System.Service;

import com.example.Zomato.System.Dto.orderDto;
import com.example.Zomato.System.entity.Customer;
import com.example.Zomato.System.entity.MenuItem;
import com.example.Zomato.System.entity.Order;
import com.example.Zomato.System.exception.InsufficientInventoryException;
import com.example.Zomato.System.exception.ResourceNotFoundException;
import com.example.Zomato.System.repository.CustomerRepository;
import com.example.Zomato.System.repository.MenuItemRepository;
import com.example.Zomato.System.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    MenuItemRepository menuItemRepository;
    @Autowired
    CustomerRepository customerRepository;
public void placeOrder(Order order, int m_id,int c_id){


    if(!menuItemRepository.findById(m_id).isPresent()){
        throw new ResourceNotFoundException("Menu Item");
    }

    MenuItem menuItem=menuItemRepository.findById(m_id).get();
    if(menuItem.getQuantity()<order.getQt()){
        throw new InsufficientInventoryException();
    }
    menuItem.setQuantity(menuItem.getQuantity()-order.getQt());
    order.setMenuItems(menuItem);
    menuItemRepository.save(menuItem);
    if(!customerRepository.findById(c_id).isPresent()){
        throw new ResourceNotFoundException("Customer ");
    }
    Customer customer =customerRepository.findById(c_id).get();
    order.setCustomer(customer);
    orderRepository.save(order);
}
public List<orderDto> viewOrderHistory(){
    return orderRepository.findAll().stream().map((a)->new orderDto(a.getId(),a.getStatus(),a.getMenuItems().getItemname(),
            a.getMenuItems().getPrice(),a.getCustomer().getName(),a.getCustomer().getPhone())).toList();
}
public void UpdateOrder(int o_id,Order order){
    if(!orderRepository.findById(o_id).isPresent()){
        throw new ResourceNotFoundException("Order ");
    }
    Order o = orderRepository.findById(o_id).get();
    o.setStatus(order.getStatus());
    orderRepository.save(o);
}
}
