package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {

		Student s1 = new Student(1900, "John");
		Student s2 = new Student(1090, "Marry");
		Student s3 = new Student(1890, "Anna");
		Student s4 = new Student(1930, "Macla");
		Student s5 = new Student(1900, "Tyra");

		List l = new ArrayList();

		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		System.out.println("Before Sort");
		System.out.println(l);

		Collections.sort(l, new Student_Id_Sort());

		System.out.println("After Sort(Std iD)");
		System.out.println(l);

		Collections.sort(l, new Student_Name_Sort());

		System.out.println("After Sort(Std Name)");
		System.out.println(l);

	}

}
