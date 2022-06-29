package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserDao {
	@Autowired
UserRepository repo;
public User insert(User u) {
	return repo.save(u);
}
public List<User> getall(){
	return repo.findAll();
}
public List<User> findbynameandpassword(String username,String password){
	return repo.findByNameAndPassword(username, password);
	
}
}

