package com.wait;

import java.util.Date;

/**
 * This Class is Demo from Course founder for Thread wait,notify and notify all
 * 
 * @author Course Founder
 * @category Training
 *
 */
public class Waiter implements Runnable {

	Message message;

	public Waiter(Message message) {
		this.message = message;
	}

	/*
	 * 
	 * This method will move the thread in to Waiting stage. (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public void run() {

		String name = Thread.currentThread().getName();
		System.out.println("Waiter Thread Name:" + name);

		System.out.println("waiting started time thread:" + name + ",Time:" + new Date().getTime());

		synchronized (message) {
			try {
				message.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Restared time thread:" + name + ",Time:" + new Date().getTime());
	}
}
