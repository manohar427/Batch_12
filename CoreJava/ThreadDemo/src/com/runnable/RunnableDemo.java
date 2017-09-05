package com.runnable;

public class RunnableDemo {

	public static void main(String[] args) {

		A obj = new A();
		
		Thread t1 =new Thread(obj);
		t1.start();
		
		
		Thread t2 =new Thread(obj);
		t2.start();
		
		
	}

}

class A  implements Runnable
{
	public void run() {
      
		for(int i=0;i<10;i++){
			
			System.out.println(Thread.currentThread().getName()+":"+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}