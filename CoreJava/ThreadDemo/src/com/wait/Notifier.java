package com.wait;

import java.util.Date;

/**
 * This Class is Demo from Course founder for Thread wait,notify and notify all
 * 
 * @author Course Founder
 * @category Training
 *
 */
public class Notifier implements Runnable {

	
	Message message;

	public Notifier(Message message) {
		this.message = message;
	}

	
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Notifier Thread Name:" + name);
		
		try {
			Thread.sleep(6000);
			System.out.println("Notifier started notifying :"+new Date().getTime());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (message) {
			//message.notify();
			message.notifyAll();
		}
		
	}
}
