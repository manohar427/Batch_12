package com.list;

import java.util.Comparator;

public class Student_Id_Sort implements Comparator{

	public int compare(Object o1, Object o2) {
		
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
    	  return s1.stdId-s2.stdId;
		//return s1.name.compareTo(s2.name);
    }
}
