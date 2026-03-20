package com.example.Zomato.System.Controller;

import com.example.Zomato.System.Dto.orderDto;
import com.example.Zomato.System.Service.OrderService;
import com.example.Zomato.System.entity.Order;
import com.example.Zomato.System.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/order")
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/placeorder/{m_id}/{c_id}")
    public void place(@RequestBody Order order, @PathVariable int m_id,@PathVariable int c_id){
        orderService.placeOrder(order,m_id,c_id);
    }
    @GetMapping("/viewallorders")
    public List<orderDto> getOrders(){
       return orderService.viewOrderHistory();
    }
    @PutMapping("/updateorder/{id}")
    public void updateOrder(@PathVariable int id, @RequestBody Order order){
        orderService.UpdateOrder(id,order);
    }

}
