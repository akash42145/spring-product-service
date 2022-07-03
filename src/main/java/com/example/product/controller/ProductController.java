package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
		
	}
	
	@GetMapping
	public List<Product> getAllProduct() {
		return service.getAllProduct();
		
	}	
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable int id) {
		return service.getProduct(id);
		
	}
	
	@GetMapping("change-inventory/{id}")
	public Product changeInventory(@PathVariable int id, @RequestParam int count) {
		return service.changeInventoryCount(id, count);
		
	}
	
	
	
	

}
