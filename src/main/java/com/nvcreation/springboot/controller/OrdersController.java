package com.nvcreation.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvcreation.springboot.entity.Order;
import com.nvcreation.springboot.services.OrdersService;

@RestController
public class OrdersController {
	
	@RequestMapping("/orders")
	public List<Order> getOrders(){
		return new OrdersService().getOrders() ;
	}
	
	@RequestMapping("/orders/{id}")
	public Order getOrder(@PathVariable int id) {
		return new OrdersService().getOrder(id);
	}
	
	

}
