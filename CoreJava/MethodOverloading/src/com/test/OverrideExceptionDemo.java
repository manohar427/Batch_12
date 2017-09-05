package com.test;

public class OverrideExceptionDemo {

}


class A{
	public void add(){
		System.out.println("A-add()");
	}
	
	public void sub(){
		System.out.println("A-sub()");
	}
	
	public void div() throws ClassNotFoundException{
		System.out.println("A-div()");
	}
	
	public void multi() throws Exception{
		System.out.println("A-div()");
	}
	
}

class B extends A{
	
	public void add()throws NullPointerException {//1
		
	}
	
	/*public void sub() throws ClassNotFoundException{//2
		System.out.println("A-add()");
	}*/
	
	/*public void div(){ 
		System.out.println("A-div()");  //3
	}
	*/
	public void div()throws ClassNotFoundException{ //3
		System.out.println("A-div()");
	}
	
	public void multi() throws ClassNotFoundException{ //4
		System.out.println("A-div()");
	}
}