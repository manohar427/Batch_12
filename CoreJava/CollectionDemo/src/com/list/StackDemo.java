package com.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		
		  Stack s = new Stack();
		  s.add("X");
		  s.add("askjdsadf");
		  s.add("TT");
		  s.add("OO");
		  
		  System.out.println(s.pop());//00
		  System.out.println(s.pop());//TT
		  System.out.println(s.pop());//ask
		  s.push("OPOJN");
		  s.add("(((");//9
		  s.push(")))");//10
		  System.out.println(s.pop());//10
		  System.out.println(s.pop());//9
	}

}
