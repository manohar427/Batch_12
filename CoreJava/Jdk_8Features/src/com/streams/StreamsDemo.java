package com.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		
		
		list1.add(110);
		list1.add(101);
		list1.add(110);
		list1.add(110);
		list1.add(120);
		list1.add(10);
		list1.add(120);
		
		for(int i=0;i<100000;i++){
			list1.add(i);
		}
		
		
		for(int i=0;i<list1.size();i++){
			list1.get(i);
		}
		System.out.println("============");
		
		
		list1.forEach( p -> System.out.println(p) );
		
		System.out.println(new Date().getTime());
		Stream<Integer> pst = list1.parallelStream();//5
		System.out.println(new Date().getTime());
		
		System.out.println(">>>>");
		
		System.out.println(new Date().getTime());
		Stream<Integer> st = list1.stream();//6
		System.out.println(new Date().getTime());
		
		Stream<Integer> fdata = pst.filter(p-> p>100 );
		
		
		System.out.println(">100 elements :"+pst.toString());
		System.out.println("Filtedred Data:");
		fdata.forEach(p-> System.out.println(p));
		
	}

}
