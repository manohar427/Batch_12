package com.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferDemo {

	public static void main(String[] args) {
       
		try{
		File file = new File("C:\\Users\\dell\\Desktop\\Test\\xyz.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String name = "CF Technologies,Bangalore,India";
		
		bw.write(name);
		
		fw.close();
		
		}catch(IOException e){
			e.printStackTrace();
		}
		
		/*try{
			File file = new File("C:\\Users\\dell\\Desktop\\Test\\xyz.txt");
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String name = null;
			
			while( (name = br.readLine()) !=null){
				System.out.println(name);
			}
			
			br.close();
			
			}catch(IOException e){
				e.printStackTrace();
			}*/
		
	}

}
