package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternilazationDemo {

	public static void main(String[] args) {
         
	/*	Student s = new Student("Abc", 10, "HJJUI9890");
		
		//Serialization
		try {
			FileOutputStream f = new FileOutputStream("student.txt");
			
			ObjectOutputStream oo = new ObjectOutputStream(f);
			oo.writeObject(s);
			oo.close();
			f.close();
			System.out.println("Object written in to file system");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}*/
		
		
		try {
			FileInputStream fi = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fi);
			Student std = (Student)ois.readObject();
			ois.close();
			fi.close();
			
			System.out.println("Age:"+std.age);
			System.out.println("name:"+std.name);
			System.out.println("SSN:"+std.ssn);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
