package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class A_manager {

	public static void main(String[] args) {

         /* B b = new B();
          
          b.a = 10;
          b.b = 20;
		
		//Serialization
		try {
			FileOutputStream f = new FileOutputStream("A.txt");
			
			ObjectOutputStream oo = new ObjectOutputStream(f);
			oo.writeObject(b);
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
			FileInputStream fi = new FileInputStream("A.txt");
			ObjectInputStream ois = new ObjectInputStream(fi);
			B b = (B)ois.readObject();
			ois.close();
			fi.close();
			
			System.out.println("a:"+b.a);
			System.out.println("b:"+b.b);
			
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
