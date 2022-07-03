package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Product addProduct(Product p) {
		return repository.save(p);
	}

	public Product getProduct(int id) {

		return repository.findById(id).orElseThrow(() -> new RuntimeException());
	}

	public Product changeInventoryCount(int id, int count) {

		Product p = repository.findById(id).orElseThrow(() -> new RuntimeException());

		repository.changeInventoryCount(id, p.getAvailableStocks() + count);

		return repository.findById(id).orElseThrow(() -> new RuntimeException());
	}

	public List<Product> getAllProduct() {
		return repository.findAll();
	}

}
