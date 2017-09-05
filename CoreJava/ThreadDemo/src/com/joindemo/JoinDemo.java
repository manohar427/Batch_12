package com.joindemo;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {

		
		
		System.out.println("Printing papers....");
		
		Loadpapers lp = new Loadpapers();
		Thread t = new Thread(lp);
		t.start();
		
		t.join();
		
		System.out.println("Resume Printing papers....");
		
		System.out.println("Printing is done");
		
	}

}


class Loadpapers implements Runnable{
	public void run() {
		System.err.println("Start Loading papers....");
		
		try {
			Thread.sleep(10000);//5
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println("Loading Papers are Done.. ready for printing..");
	}
}