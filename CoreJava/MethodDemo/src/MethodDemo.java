
public class MethodDemo {

	public static void main(String[] args) {

		Customer c = new Customer();
		
		String name = c.getName(50);
		
		System.out.println(name);
	}

}


class Customer{
	
	String getName(int custId){
		
		if(custId == 10){
			
			return "John";
			
		}else if(custId == 20){
			return "Mary";
		}else{
			return "Unknown";
		}
		
	}
    
	Customer(){
		System.out.println("I am from Customer()");
	}

}