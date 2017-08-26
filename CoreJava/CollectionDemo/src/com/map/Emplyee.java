package com.map;

public class Emplyee implements Comparable{
	
	int salary;
	String name;

	public Emplyee(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emplyee other = (Emplyee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
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
