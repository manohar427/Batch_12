package com.synch;

public class StaticSynchronization {

	public static void main(String[] args) {

		T1 tt = new T1();

		Thread t = new Thread(tt);
		t.start();

		Thread t1 = new Thread(tt);
		t1.start();
	}

}

class ModernPrinter {

	//public static synchronized void printNumbers() throws InterruptedException {
	public static  void printNumbers() throws InterruptedException {

		synchronized(ModernPrinter.class){
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			Thread.sleep(1000);
		}
		}
	}
}

class T1 implements Runnable {

	public void run() {
		try {
			ModernPrinter.printNumbers();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}