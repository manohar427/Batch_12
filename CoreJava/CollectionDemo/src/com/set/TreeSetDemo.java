package com.set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		
		
		Set ts = new TreeSet(Collections.reverseOrder());
		
		ts.add(90);
		ts.add(40);
		ts.add(90);
		ts.add(60);
		ts.add(90);
		ts.add(990);
		ts.add(890);
		ts.add(9);
		
		System.out.println(ts);
		
	}

}
