package com.test;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable{
	
	String name;
	int age;
	String ssn;

	public Student(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		age = in.readInt();
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
	}

	public Student() {
	}
}
