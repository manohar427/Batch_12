package com.funcin;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		 Fi fi = ()->{
			 System.out.println("Add");
		 };
		 
		 fi.add();
	}

}


interface In{
	 default void add(){//1
		System.out.println("Add impl");
	}
	 
	  static  void sum(){//2
			System.out.println("Add impl");
		}
	 
	/*@Override
	static String toString(){ //3
		
	}*/
	 
}

interface A{
	void add();//?
}

interface B{
	void add();//?
}

interface C  extends A,B
{
	
}

@FunctionalInterface
interface Fi{
	public void add();
	//public void sum();
}









