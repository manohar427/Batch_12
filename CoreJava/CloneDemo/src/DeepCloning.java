
public class DeepCloning {

	public static void main(String[] args) {

		Address adr = new Address("Balr","India");
		
		Student s1 = new Student("Abc",10,adr);
		try {
			Student s2 = (Student)s1.clone();
			
			System.out.println("Original Obj:"+s1);
			System.out.println("Clone Obj:"+s2);
			
			s1.marks= 15;
			s1.address.city = "Hyd";
			
			System.out.println("After Updating Original Obj:"+s1);
			System.out.println("After Updating Clone Obj:"+s2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

class Student implements Cloneable{
	
	String name;
	int marks;
	Address address;
	
	public Student(String name, int marks,Address address) {
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	public Student() {
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	protected Object clone() throws CloneNotSupportedException {
		
		Student s = (Student)super.clone();
		
		Address ad = new Address();
		ad.city = address.city;
		ad.country = address.country;
		
		s.address = ad;
		
		return s;
		
	}
}

class Address{
	String city;
	String country;

	public Address(String city, String country) {
		this.city = city;
		this.country = country;
	}

	public Address() {
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
	
	
	
	
	
}