package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Book")
public class bookentity {
 @Id
 @GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String desec;
	
	private double price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesec() {
		return desec;
	}

	public void setDesec(String desec) {
		this.desec = desec;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public bookentity(Long id, String name, String desec, double price) {
		super();
		this.id = id;
		this.name = name;
		this.desec = desec;
		this.price = price;
	}

	public bookentity() {
		super();
	}
	
	
}
