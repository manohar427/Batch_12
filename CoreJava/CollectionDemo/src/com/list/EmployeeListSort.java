package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.list.Emplyee;

public class EmployeeListSort {

	public static void main(String[] args) {
		Emplyee e1 = new Emplyee(900,"John");
		Emplyee e2 = new Emplyee(100,"Lory");
		Emplyee e3 = new Emplyee(500,"Anna");
		Emplyee e4 = new Emplyee(300,"Mike");
		Emplyee e5 = new Emplyee(300,"Mike");
		Emplyee e6 = new Emplyee(300,"Mike");
		
		
		List l = new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		
		System.out.println("Before Sorting");
		System.out.println(l);
		
		
		Collections.sort(l);
		
		System.out.println("After Sorting");
		System.out.println(l);
		
	}

}
