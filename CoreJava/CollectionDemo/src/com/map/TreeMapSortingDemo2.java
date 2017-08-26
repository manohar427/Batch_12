package com.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortingDemo2 {

	public static void main(String[] args) {
		
		Emplyee e1 = new Emplyee(12000,"John");
		Emplyee e2 = new Emplyee(10002,"Cera");
		Emplyee e3 = new Emplyee(17000,"Raj");
		Emplyee e4 = new Emplyee(10902,"Tony");
		
        Map tm = new TreeMap();
		
		tm.put(e1, "E1- Details");
		tm.put(e2, "E2- Details");//?
		tm.put(e3, "E3- Details");//
		tm.put(e4, "E4- Details");//
		
		
		System.out.println(tm);
		

	}

}
