package com.exec;

public class OutOfMemoryError {

	public static void main(String[] args) {
          A obj = new A();
          obj.m1();
	}

}
class A
{
	void m1(){
		System.out.println("m1()");
		m2();
	}
	
	void m2(){
		System.out.println("m2()");
		m1();
	}
}