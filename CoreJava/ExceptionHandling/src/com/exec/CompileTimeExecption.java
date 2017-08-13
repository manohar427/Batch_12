package com.exec;

public class CompileTimeExecption {

	public static void main(String[] args) {

		try{
			Class.forName("com.exec.CompileTimeExecptionX");	
		}catch(ClassNotFoundException e){
			System.out.println("Class Not found");
		}
		
	}

}
