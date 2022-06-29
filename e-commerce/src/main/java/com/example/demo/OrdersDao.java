package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrdersDao {
@Autowired
OrdersRepository repo;

public Orders insert(Orders o) {
	return repo.save(o);
}
public List<Orders>getall(){
	return repo.findAll();
}
}
