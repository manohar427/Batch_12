
public class A {

	protected void printCustDetails(){
		System.out.println("Customer Details here");
	}
	
	 void showCustDetails(){
		System.out.println("Show Customer Details here");
	}
	
}

class B extends A{
	
	public void printCustDetails(){
		System.out.println("Customer Details here");
	}
	
	public void showCustDetails(){
		System.out.println("Show Customer Details here");
	}
	
}