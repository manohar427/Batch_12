package com.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
       /*File file = new File("test");
       
       boolean f = file.mkdir();
       
       if(f){
    	   System.out.println("Directory created successfully.");
       }else{
    	   System.out.println("Directory is not created.");
       }*/
       
     /* File file = new File("X/Y");
       
       boolean f = file.mkdirs();
       
       if(f){
    	   System.out.println("Directory created successfully.");
       }else{
    	   System.out.println("Directory is not created.");
       }*/
		
		File file = new File("abc.txt");
	       
		  try{
			  boolean f = file.createNewFile();
			  if(f){
		    	   System.out.println("File is  created successfully.");
		       }else{
		    	   System.out.println("File is not created.");
		       }
		  }catch(IOException e){
			  System.out.println("File is not created soe issue.");
		  }
	       
	       
	      
		
	}

}
