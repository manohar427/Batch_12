package com.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class DQueDemo {

	public static void main(String[] args) {

		
		Queue dq = new  ArrayDeque();
		dq.add(345);
		dq.add(567);
		dq.add(789);
		dq.add(23);
		dq.add(23);
		dq.add(23);
		
		System.out.println(dq);
		
		Iterator it = dq.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
