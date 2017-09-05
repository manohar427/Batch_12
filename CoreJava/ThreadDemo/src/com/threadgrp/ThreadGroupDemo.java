package com.threadgrp;

public class ThreadGroupDemo {

	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("My Thread Group");
		
		T1 tt1 = new T1();
		Thread t1 = new Thread(tg,tt1,"One");
		t1.start();
		
		T2 tt2 = new T2();
		Thread t2 = new Thread(tg,tt2,"Two");
		t2.start();
		
		tg.list();
		
		System.out.println(tg.getName());
		//System.out.println(tg.activeCount());
		
		for(int i=0;i<10;i++){
			System.out.println("Active count:"+tg.activeCount());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}

class T1 implements Runnable {
	
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class T2 implements Runnable {
	
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}