package com.lambda;

public class LambdaDemo {

	public static void main(String[] args) {

		/*I i = new Impl();
		i.add(10, 20);*/
		
        I obj = (a,b)->{
        	System.out.println("Sum:"+(a+b));
        };
        obj.add(10, 20);
		
		X x = (a,b) -> {
			return a+b;
		};
		
	    int sum = x.add(100, 200);
	    
	    System.out.println("Sum:"+sum);
	}

}

interface I{
	public void add(int ab,int b);
}

/*class Impl implements I
{
	public void add(int a,int b) {
		System.out.println("Sum"+(a+b));
	}
}*/

interface X{
	public int add(int a,int b);
}