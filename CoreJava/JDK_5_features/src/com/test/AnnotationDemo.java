package com.test;

public class AnnotationDemo {

	public static void main(String[] args) {

	}

}


class P extends Object{
	
	int x= 0;

	public String toString() {
		return "P [x=" + x + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		P other = (P) obj;
		if (x != other.x)
			return false;
		return true;
	}
}


class X1{
	
	@Deprecated
	void add(){
		
	}
}

class X2{
	
	void add() {
		X1 x = new X1();
		x.add();
	}
}