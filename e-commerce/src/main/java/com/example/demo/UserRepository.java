package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface UserRepository extends JpaRepository<User, String> {
 
  @Query("select user from User user where user.username=?1 and user.password=?1")
  public List<User> findByNameAndPassword(String username,String password);
}
