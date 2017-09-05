package com.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread.currentThread().setName("XYZ");
       
		//int x =10/0;
		
		MyThread mt1 = new MyThread();
		mt1.start();
		//mt.start();//Dup opretaion
		
		MyThread mt2 = new MyThread();
		mt2.start();
		
		System.out.println("My thread ID1:"+mt1.getId());
		System.out.println("My thread ID2:"+mt2.getId());
		
		String name = Thread.currentThread().getName();
		
		System.out.println("Main/Current thread name:"+name);
		
		
		System.out.println("Main Thread Priority:"+Thread.currentThread().getPriority());//5
		
	}

}


class MyThread extends Thread
{
	public void run() {
		
		System.out.println(" Before My Thread Priority:"+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		Thread.currentThread().setPriority(5);
		
		System.out.println(" After My Thread Priority:"+Thread.currentThread().getPriority());
		
		String name = Thread.currentThread().getName();
		
		System.out.println("MyThread name:"+name);
		
		
		Thread.currentThread().setName("ABC");
		
         String name1 = Thread.currentThread().getName();
		
		System.out.println("After MyThread name:"+name1);
		
		for(int i=0;i<10;i++){
			System.out.println("I:"+i);
		}
	}
}