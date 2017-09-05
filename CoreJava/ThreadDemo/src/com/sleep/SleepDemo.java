package com.sleep;

public class SleepDemo {

	public static void main(String[] args) {

		MyThread mt1 = new MyThread();
		mt1.start();
		
	}

}

class MyThread extends Thread
{
	
	public void run() {
		
		for(int i=0;i<10;i++){
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}