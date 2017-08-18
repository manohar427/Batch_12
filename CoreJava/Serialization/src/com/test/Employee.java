package com.test;

import java.io.Serializable;

public class Employee implements Serializable{

	int empId;
	String name;
	Address address;
	public Employee(int empId, String name, Address address) {
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	
	
}
