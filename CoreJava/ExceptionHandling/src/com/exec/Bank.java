package com.exec;

public class Bank {

	public int getMoney(int acc)throws Exception,ClassNotFoundException{
		int money = 0;
		try{
			 money = 1000/0;
		}catch(Exception e){
			//System.out.println("Somwthing went wrong");
			throw e;
		}
		
		
		
		return money;
	}
}
