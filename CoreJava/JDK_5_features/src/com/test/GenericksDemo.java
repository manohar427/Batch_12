package com.test;

import java.util.ArrayList;
import java.util.List;

public class GenericksDemo {

	public static void main(String[] args) {

		
		List l = new ArrayList();
		
		l.add("Abc");
		l.add(345);
		l.add(123.56);
		
		List<String> li = new ArrayList<String>();
		//li.add(23);
		li.add("Abc");
		
	}

}
