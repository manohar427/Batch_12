package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeManager {

	public static void main(String[] args) {

		/*Address address = new Address("Blr","India");
		
		Employee emp = new Employee(10019,"John",address);*/
		
		//Serialization
				/*try {
					FileOutputStream f = new FileOutputStream("emplyee.txt");
					
					ObjectOutputStream oo = new ObjectOutputStream(f);
					oo.writeObject(emp);
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
			FileInputStream fi = new FileInputStream("emplyee.txt");
			ObjectInputStream ois = new ObjectInputStream(fi);
			Employee emp = (Employee)ois.readObject();
			ois.close();
			fi.close();
			
			System.out.println("empId:"+emp.empId);
			System.out.println("name:"+emp.name);
			System.out.println("city:"+emp.address.city);
			System.out.println("country:"+emp.address.country);
			
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
