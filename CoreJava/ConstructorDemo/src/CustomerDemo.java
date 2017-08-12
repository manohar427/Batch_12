
public class CustomerDemo {

	public static void main(String[] args) {
		
		A y = new A();
		
		A z = new A(999);
		
		A p = new A(10,20);
	}
}

class A{
	int x;
	
	A(){
		
		System.out.println("I am from class A constructor()");
	}
	
    A(int y){
		x =y ;
		System.out.println("I am from class A constructor(int)");
	}
	
    A(int y,int x){
		x =y ;
		System.out.println("I am from class A constructor(int,int)");
	}
    
}