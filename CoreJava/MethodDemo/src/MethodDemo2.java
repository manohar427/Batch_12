
public class MethodDemo2 {

	public static void main(String[] args) {
		
       Person p = new Person();
       
       p.showPersonDetails(100);
	}

}

class Person{
	
	String getName(int custId){
		return "John";
	}
	
	void showPersonDetails(int custId){		
		System.out.println("name:XYZ");
		System.out.println("Age:20");		
	}
	
}