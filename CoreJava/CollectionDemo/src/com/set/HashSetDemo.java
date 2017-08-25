package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		
		Set hs = new HashSet();
		
		hs.add(123);
		hs.add(123);
		hs.add(103);
		hs.add(123);
		hs.add(12);
		hs.add(912);
		hs.add("Ajkahd");
		
		System.out.println(hs);
		
	}

}
