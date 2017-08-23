package com.test;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		int marks[] = {23,45,7,899,33,6778,990};
		/*for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}
		
		Arrays.sort(marks);
		System.out.println("After Sorting");
		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}*/
		
		String names[] = {"Rama","Krishna","Murali","Archana"};
		
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
		Arrays.sort(names);
		System.out.println("After Sorting");
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
	}

}
