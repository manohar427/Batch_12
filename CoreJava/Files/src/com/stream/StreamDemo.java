package com.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo {

	public static void main(String[] args) {
     
		/*try{
		//Create file
		
		File file = new File("pqr.txt");
		
		//write the data in to file
		
		FileOutputStream fos = new FileOutputStream(file);
		String name = "Course Founder Technologies";
		byte all[] = name.getBytes();
		fos.write(all);
		fos.close();
		
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}*/
		
		try{
		File file =  new File("C:\\Users\\dell\\Desktop\\Stocks.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		int i = 0;
		while( (i=fis.read()) != -1){
			System.out.print((char)i);
		}
		fis.close();
		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}
