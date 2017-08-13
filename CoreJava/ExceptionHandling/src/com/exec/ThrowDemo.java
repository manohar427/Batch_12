package com.exec;

public class ThrowDemo {

	public static void main(String[] args) {
 
		try{
			Bank bank = new Bank();
			int money = bank.getMoney(89098);
			System.out.println(money);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}

}
