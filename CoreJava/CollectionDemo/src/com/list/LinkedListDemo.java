package com.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		List ll = new LinkedList();
		LinkedList l2 = new LinkedList();

		ll.add(123);
		ll.add("Abc");
		ll.add(123.4);

		System.out.println(ll);

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		Iterator it =  ll.iterator();
	      
	      while(it.hasNext()){
	    	  System.out.println(it.next());
	      }
	      
	      //4
	      ListIterator ll1 =  ll.listIterator();
	      while(ll1.hasNext()){
	    	  System.out.println(ll1.next());
	      }
	      //5
	      while(ll1.hasPrevious()){
	    	  System.out.println(ll1.previous());
	      }
	}

}
