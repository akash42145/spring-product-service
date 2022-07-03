package com.example.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Transactional
	@Modifying
	@Query("update Product set availableStocks = :stock where id = :productId")
	public Integer changeInventoryCount(int productId, int stock);

}
