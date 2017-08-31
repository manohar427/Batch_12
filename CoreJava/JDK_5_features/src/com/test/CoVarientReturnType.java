package com.test;

public class CoVarientReturnType {

	public static void main(String[] args) {

	}

}


class M
{
	protected X add(){
		return new X();
	}
	
	protected Number sub(){
		return 10;
	}
	
}
class N extends M{
	
	public Y add(){
		return new Y();
	}
	
	protected Integer sub(){
		return 20;
	}
}

class X{
	
	
}

class Y extends X
{
	
}