package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
      
		Map hmap =  new HashMap();
		
		hmap.put("10", "Tean");
		hmap.put("1", "One");
		hmap.put("100", "Hundres");
		hmap.put(89, "EightyNinhe");
		hmap.put(8, 881);//9000
		hmap.put(8, 882);//9090
		hmap.put(8, 883);//9899
		hmap.put(null,"XYZ-1");
		hmap.put(null,"XYZ-2");
		hmap.put(null,null);
		
		System.out.println(hmap);
		
		System.out.println(hmap.get("1"));
	}

}
