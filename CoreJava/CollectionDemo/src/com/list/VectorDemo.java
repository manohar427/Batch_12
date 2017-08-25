package com.list;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
      
		List vect = new Vector();
		vect.add("123");
		vect.add(2323);
		vect.add(345.56);
		
		System.out.println(vect);
		
		Iterator it = vect.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		for(int i=0;i<vect.size();i++){
			System.out.println(vect.get(i));
		}
		
		//4
	      ListIterator ll1 =  vect.listIterator();
	      while(ll1.hasNext()){
	    	  System.out.println(ll1.next());
	      }
	      //5
	      while(ll1.hasPrevious()){
	    	  System.out.println(ll1.previous());
	      }
	}

}
