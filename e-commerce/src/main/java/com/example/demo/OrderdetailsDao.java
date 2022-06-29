package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderdetailsDao {
	@Autowired
	OrderdetailsRepository repo;
	public List<Orderdetails>getall(){
		return repo.findAll();
	}
	
}
