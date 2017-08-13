
public class StaticExample {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.getAddress(100);
		cust1.getName(100);
		System.out.println(cust1.x);//100
		System.out.println(cust1.y);//100
		
		
		Customer cust2 = new Customer();
		cust2.getAddress(200);
		
		System.out.println(cust2.x);//200
		System.out.println(cust2.y);//0
		
		
		
		
	}

}

class Customer{
	int x = 0;
	static int y = 0;
	
	String getAddress(int id){
		x = id;
		
		return "Bangalore,India";
	}
	
	 String getName(int id){
		y = id;
		return "Abc";
	}
}