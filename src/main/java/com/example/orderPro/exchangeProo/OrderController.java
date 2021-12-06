package com.example.orderPro.exchangeProo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class OrderController {
    @Autowired
    private OrderRepo orderRepo;

    @GetMapping("/orders")
    public List<Order> listAll() {
        return orderRepo.findAll();
    }

    @PostMapping(value="/save")
    public String saveUser(@RequestBody Order order) {
        orderRepo.save(order);
        return "Order Details Saved to Database...";
    }

}