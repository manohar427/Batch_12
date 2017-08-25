package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set lhs = new LinkedHashSet();

		lhs.add(123);
		lhs.add(123);
		lhs.add(103);
		lhs.add(123);
		lhs.add(12);
		lhs.add(912);
		lhs.add("Ajkahd");

		System.out.println(lhs);
	}

}
