package com.map;

public class Student {
	
	int stdId;
	String name;
	
	public Student(int stdId, String name) {
		this.stdId = stdId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + stdId;
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stdId != other.stdId)
			return false;
		return true;
	}
	

}
