package com.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String city;
	private String ststus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStstus() {
		return ststus;
	}
	public void setStstus(String ststus) {
		this.ststus = ststus;
	}
	public User(int id, String name, String city, String ststus) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.ststus = ststus;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", ststus=" + ststus + "]";
	}
	
	
	

}
