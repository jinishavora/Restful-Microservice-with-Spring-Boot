package com.nvcreation.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nvcreation.springboot.entity.Order;

@Service
public class OrdersService {
	
	List<Order> orders = new ArrayList<>();
	
	public OrdersService() {
		
		orders.add(new Order(1, "1st Order", "This is First Order"));
		orders.add(new Order(2, "2nd Order", "This is Second Order"));
		orders.add(new Order(3, "3rd Order", "This is Third Order"));
		orders.add(new Order(4, "4th Order", "This is Fourth Order"));
		orders.add(new Order(5, "5th Order", "This is Fifth Order"));
		
	}
	
	
	public List<Order> getOrders(){
		return orders;
	}
	
	
	public Order getOrder(int id){
		for(Order order: orders) {
			if(order.getOrderId()==id) {
				return order;
			}
		}
		return null;
	}

}
