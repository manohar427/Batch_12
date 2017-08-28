package com.list;

public class Emplyee implements Comparable{
	
	int salary;
	String name;

	public Emplyee(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Emplyee [salary=" + salary + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		Emplyee e = (Emplyee)o;
		//return this.salary-e.salary; //ASC
		//return -(this.salary-e.salary); //DSC
		
		return this.name.compareTo(e.name);
	}

}
