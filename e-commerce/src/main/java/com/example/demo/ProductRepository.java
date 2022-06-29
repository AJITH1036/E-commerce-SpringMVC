package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query("select product from Product product where product.category=?1")
	List<Product> findByCategory(String category);
	
	@Query("select product from Product product where product.name=?1")
	List<Product> findByName(String name);
	

}