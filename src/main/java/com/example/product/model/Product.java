package com.example.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String name;
	private double price;
	private int availableStocks;
	
	
	public Product() {
		super();
		
	}
	public Product(String name, double price, int availableStocks) {
		
		this.name = name;
		this.price = price;
		this.availableStocks = availableStocks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAvailableStocks() {
		return availableStocks;
	}
	public void setAvailableStocks(int availableStocks) {
		this.availableStocks = availableStocks;
	}
	
	

}
