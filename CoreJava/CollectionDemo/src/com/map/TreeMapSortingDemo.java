package com.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortingDemo {

	public static void main(String[] args) {

Map tm = new TreeMap();
		
		tm.put("Abc", "Xy");
		tm.put("Ytr", "Op");
		tm.put("Pqr", "Qw");
		tm.put("Bty", "Xy");
		tm.put("Yst", "Op-1");
		tm.put("Ctr", "Op-2");
		tm.put("Uit", "Qw");
		//tm.put("Abc", "Qw");
		//tm.put(null, "Qw-null");
		
		System.out.println(tm);
	}

}
