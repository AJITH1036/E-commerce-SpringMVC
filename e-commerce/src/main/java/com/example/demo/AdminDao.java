package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDao {
@Autowired
AdminRepository repo;
public List<Admin> findbynameandpassword(String name,String password){
	return repo.findByNameAndPassword(name, password);	
}
public Admin update(Admin a) {
	Admin ad=repo.findById(a.getName()).orElse(null);
	ad.setPassword(a.getPassword());
	return repo.save(a);
}
	
}

