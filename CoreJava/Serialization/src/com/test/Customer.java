package com.test;

import java.io.Serializable;

public class Customer implements Serializable{

	int age;
	String name;
	static String pwd = "XXXXXX";
	transient String ssn = "000000";
	
	
	public Customer(int age, String name, String pwd, String ssn) {
		this.age = age;
		this.name = name;
		this.pwd = pwd;
		this.ssn = ssn;
	}
	
	
	
}
