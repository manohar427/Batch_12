package com.list;

import java.util.LinkedList;
import java.util.List;

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

	}

}
