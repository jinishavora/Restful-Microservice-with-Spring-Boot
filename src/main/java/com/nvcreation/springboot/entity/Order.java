package com.nvcreation.springboot.entity;

public class Order {

	int orderId;
	String itemName;
	String itemDesc;
	
	
	public Order(int orderId, String itemName, String itemDesc) {
		
		this.orderId = orderId;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
	
}
