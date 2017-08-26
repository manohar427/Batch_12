package com.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
          
		Map tm = new TreeMap();
		
		tm.put(34, "Xy");
		tm.put(25, "Op");
		tm.put(36, "Qw");
		tm.put(134, "Xy");
		tm.put(245, "Op-1");
		tm.put(245, "Op-2");
		tm.put(6, "Qw");
		//tm.put("Abc", "Qw");
		//tm.put(null, "Qw-null");
		
		System.out.println(tm);
	}

}
