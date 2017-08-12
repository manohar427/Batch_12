
public class PersonManger {

	public static void main(String[] args) {
   
		Person p = new Person();
		p.getName(9986781724l);
	}

}


class Person{
	
	String getName(int pid){
		//Logic 
		return "XYZ";
	}
	
	String getName(String email){
		return "XYZ";
	}
	
	
	String getName(long phno){
		return "XYZ";
	}
}