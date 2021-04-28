package com.te.DemoSpringDemo.bean;

import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
	public Customer() {
		
	}
	private int id;
	private String name;
	private List products;
	private Set<Long> contacts;
	
	
}
