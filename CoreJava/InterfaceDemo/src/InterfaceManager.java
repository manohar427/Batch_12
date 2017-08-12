
public class InterfaceManager {

	public static void main(String[] args) {

		MyInterface mi = new MyInterfaceImpl();
		
		mi.fundTransfer();
		mi.updateMobNo();
		mi.validatePwd();
		
		
		int abc = MyInterface.x;
		
		//MyInterface.x = 200;
		
		System.out.println(abc);
	}

}
