package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
      ArrayList al = new ArrayList();
      al.add(120);//0
      al.add("Abc");//1
      al.add(123.45);//2
      al.add('M');//3
      
      //1
    //  System.out.println(al);
      
      //2
      /*for(int i=0;i<al.size();i++){
    	  System.out.println(al.get(i));
      }*/
      
      //3
      Iterator it =  al.iterator();
      
     /* while(it.hasNext()){
    	  System.out.println(it.next());
      }*/
      
      //4
      ListIterator li =  al.listIterator();
      while(li.hasNext()){
    	  System.out.println(li.next());
      }
      //5
      while(li.hasPrevious()){
    	  System.out.println(li.previous());
      }
      
	}

}
