package com.test;

import java.io.Serializable;

public class Address implements Serializable{

	String city;
	String country;
	public Address(String city, String country) {
		this.city = city;
		this.country = country;
	}
	
}
