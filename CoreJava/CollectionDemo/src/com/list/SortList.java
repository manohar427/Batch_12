package com.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
      
		List l = new ArrayList();
		l.add(1203);
		l.add(1238);
		l.add(1023);
		l.add(1273);
		l.add(1423);
		l.add(1238);
		l.add(1238);
		
		System.out.println("Before Sort:"+l);
		
		Collections.sort(l);
		
		System.out.println("After Sort(ASC):"+l);
		
		Collections.reverse(l);
		System.out.println("After Sort(DSC):"+l);
		
	}

}
