package com.list;

public class Student {
	
	int stdId;
	String name;
	
	public Student(int stdId, String name) {
		this.stdId = stdId;
		this.name = name;
	}

	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + "]";
	}

}
