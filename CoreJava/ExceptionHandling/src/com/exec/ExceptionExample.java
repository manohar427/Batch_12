package com.exec;

public class ExceptionExample {

	public static void main(String[] args) {

		Student s = new Student();
		int avg = s.getAvgMarks();
		System.out.println(avg);
		
	}

}

class Student
{
	
	int getAvgMarks(){
		int avg = 0;
		try{
			 avg =100/10;
		}catch(Exception e){
			System.out.println("canot divide by ZERO"+e.getMessage());
		}
		
		return avg;
	}
}