package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepository extends JpaRepository<Admin, String>{
	 @Query("select admin from Admin admin where admin.name=?1 and admin.password=?1")
	  public List<Admin> findByNameAndPassword(String name,String password);
     
     
}
