package com.map;

import java.util.HashMap;
import java.util.Map;

public class DuplicateDemo {

	public static void main(String[] args) {
       
		Student s1 = new Student(12,"S1");
		Student s2 = new Student(12,"S1");
		
		Map hm = new HashMap();
		
		
		hm.put(s1, "S1 Details");
		hm.put(s2, "S2 Details");
		
		
		System.out.println(hm);
		
	}

}
