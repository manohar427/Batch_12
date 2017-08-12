package com.exec;

public class ArrayException {

	public static void main(String[] args) {

		int std[] = {12,34};
		
		try{
		     System.out.println(std[0]);//12
		     System.out.println(std[1]);//34
	     	 System.out.println(std[2]);
		}catch(Exception e){
			System.out.println("Index is  not exist:"+e.getMessage());
			e.printStackTrace();
		}
		
	}

}
