package com.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map hmap = new LinkedHashMap();

		hmap.put("10", "Tean");
		hmap.put("1", "One");
		hmap.put("100", "Hundres");
		hmap.put(89, "EightyNinhe");
		hmap.put(8, 881);// 9000
		hmap.put(8, 882);// 9090
		hmap.put(8, 883);// 9899
		hmap.put(null, "XYZ-1");
		hmap.put(null, "XYZ-2");
		hmap.put(null, null);

		System.out.println(hmap);

		System.out.println(hmap.get("1"));

		Set set = hmap.keySet();

		Iterator it = set.iterator();

		while (it.hasNext()) {
			Object key = it.next();
			System.out.println("Key : " + key + ",Value:" + hmap.get(key));
		}
	}

}
