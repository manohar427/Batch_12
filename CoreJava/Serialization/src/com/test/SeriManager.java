package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriManager {

	public static void main(String[] args) {

		/*Customer c = new Customer(10, "Abc","sdjfhd*&^*&^*&b","8767565");
		
		//Serialization
		try {
			FileOutputStream f = new FileOutputStream("customer.txt");
			
			ObjectOutputStream oo = new ObjectOutputStream(f);
			oo.writeObject(c);
			oo.close();
			f.close();
			System.out.println("Object written in to file system");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//De-Serialization
		
		try {
			FileInputStream fi = new FileInputStream("customer.txt");
			ObjectInputStream ois = new ObjectInputStream(fi);
			Customer c = (Customer)ois.readObject();
			ois.close();
			fi.close();
			
			System.out.println("Name:"+c.name);
			System.out.println("Age:"+c.age);
			System.out.println("Pwd:"+c.pwd);
			System.out.println("SSN:"+c.ssn);
			
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
