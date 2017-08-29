package com.test;

public class InstanceBlockDemo {

	public static void main(String[] args) {

		 B b = new B();
		// B b1 = new B();
	}

}

class A{
	
	static {
		System.out.println("A-Static");
	}
	
	{
		System.out.println("Instance - A");
	}
	A(){
		
		System.out.println("A()");
	}
}

class B extends A{
	
	static {
		System.out.println("B-Static");
	}
	
	
	{
		System.out.println("Instance - B-1");
	}
	
	{
		System.out.println("Instance - B-2");
	}
	
	
	B(){
		super();
		System.out.println("B()");
	}
	
}
