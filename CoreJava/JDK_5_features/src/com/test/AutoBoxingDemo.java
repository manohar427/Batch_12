package com.test;

public class AutoBoxingDemo {
	int x;

	public static void main(String[] args) {

		int y;
		//1.4
		
/*	int x =10;//Premitive class
	float f =10;
	double d =10;
	long l =10l;
	short s =9;
	char a = 'M';
	*/
	Integer i = new Integer(10);//1.4
	//Integer j = 10;//1.5--->Auto boxing 
	
	Integer j = new Integer(10);//1.4
	int x1 = j;//1.5---Unboxing
	
	int x2 = j.intValue();//1.4
	
	Long l = 10l;
	Short s = 10;
	
	Integer i1 = 0;
	Short s1 = 9;
	Float f1 = 78f;
	Double d1 = 89d;

	
	
	System.out.println(i);
	System.out.println(j);
	
	}

}
