package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
      Queue pq = new   PriorityQueue();
      
      pq.add(45);
      pq.add(89);
      pq.add(55);
      pq.add(4);
      pq.add(405);
      
      
      Iterator it = pq.iterator();
      
     /* while(it.hasNext()){
    	  System.out.println(it.next());
      }*/
      
     // System.out.println(pq.peek());
     // System.out.println(pq.peek());
      
      /*System.out.println(pq.remove());
      System.out.println(pq.remove());
      System.out.println(pq.remove());
      System.out.println(pq.remove());
      System.out.println(pq.remove());*/
      /*for(int i=0;i<pq.size();i++){
    	  System.out.println(pq.poll());
      }*/
      
      for(int i=0;i<pq.size();i++){
    	  
    	  System.out.println(pq.poll());
      }
      
      
	}

}
