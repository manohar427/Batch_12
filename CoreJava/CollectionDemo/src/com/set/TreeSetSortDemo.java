package com.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortDemo {

	public static void main(String[] args) {
     
		Emplyee e1 = new Emplyee(900,"John");
		Emplyee e2 = new Emplyee(100,"Lory");
		Emplyee e3 = new Emplyee(500,"Anna");
		Emplyee e4 = new Emplyee(300,"Mike");
		
		Set s = new TreeSet();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		
		System.out.println(s);
		
	}

}
