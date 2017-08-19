
public class ShallowCloning {

	public static void main(String[] args) {
     
		Customer c = new Customer();
		c.cid = 100233;
		
		Addr ad = new Addr();
		ad.city = "Blr";
		ad.country = "India";
		
		c.addr = ad;
		
		try {
			Customer dupCust = (Customer)c.clone();
			
			System.out.println("Original Cust:"+c);
			System.out.println("Cloned Cust:"+dupCust);
			
			
			System.out.println("Updating Original Obj");
			
			
			c.addr.city = "NY";
			c.addr.country = "US";
			
			System.out.println("Original Cust:"+c);
			System.out.println("Cloned Cust:"+dupCust);
			
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

class Customer implements Cloneable{
	int cid;
	Addr addr;
	public Customer(int cid, Addr addr) {
		this.cid = cid;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", addr=" + addr + "]";
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Addr{
	String city;
	String country;
	public Addr(String city, String country) {
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Addr [city=" + city + ", country=" + country + "]";
	}
	public Addr() {
		// TODO Auto-generated constructor stub
	}
}