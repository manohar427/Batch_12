
public class VarArgsDemo {

	public static void main(String[] args) {
		add(10,20,30);
		add("Cf",1,23,455,666);
	}

	/*
	static void add(int a,int b){
		System.out.println(a+b);
	}
	*/
	static void add(int... a){
		
		int x = 0;
		for(int i : a){
			x = x + i;
		}
		System.out.println(x);
	}
	
      static void add(String name,int... a){
		
		int x = 0;
		for(int i : a){
			x = x + i;
		}
		System.out.println(x);
	}

}
