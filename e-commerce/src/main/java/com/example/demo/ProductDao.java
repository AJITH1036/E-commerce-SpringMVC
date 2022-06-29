package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductDao {
@Autowired
ProductRepository repo;
//Add product
public Product insert(Product p) {
	return repo.save(p);
}
//View products
public List<Product>getall(){
	return repo.findAll();
}
//find by name
public List<Product> getByName(String name) {
	return repo.findByName(name);	
}
//delete by id
public String deleteByid(int code) {
	repo.deleteById(code);
	return "deleted the id value:"+code; 
}

}