package com.synch;

public class SynchronizationDemo {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		T tt = new T(p);

		Thread t = new Thread(tt);
		t.start();
		
		
		Thread t1 = new Thread(tt);
		t1.start();
		
	}

}

class Printer{
	
	public synchronized void printNumbers() throws InterruptedException{
		
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			Thread.sleep(1000);
		}
	}
}

class T implements Runnable{
	
	Printer p ;
	public T(Printer p) {
		this.p = p;
	}
	public void run() {
		try {
			p.printNumbers();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}