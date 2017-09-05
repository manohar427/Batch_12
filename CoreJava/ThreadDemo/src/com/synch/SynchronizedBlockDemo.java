package com.synch;

public class SynchronizedBlockDemo {

	public static void main(String[] args) {

		NewPrinter p = new NewPrinter();
		Thread1 tt = new Thread1(p);

		Thread t = new Thread(tt);
		t.start();
		
		
		Thread t1 = new Thread(tt);
		t1.start();
	}

}

class NewPrinter{
	
	public  void printNumbers() throws InterruptedException{
		System.out.println("Start Printing....");
		synchronized(this){
			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName()+":"+i);
				Thread.sleep(1000);
			}
		}
		
		System.out.println("End Printing");
	}
}

class Thread1 implements Runnable{
	
	NewPrinter p ;
	public Thread1(NewPrinter p) {
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