package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String addressline1;
private String addressline2;
private String city;
private String pincode;
private String Phoneno;

}
