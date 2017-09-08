package com.wait;

public class WaitNotifyDemo {

	public static void main(String[] args) {
       Message m = new Message("Test Message");
       
       Thread w1 = new Thread(new Waiter(m));
       w1.start();
       
       Thread w2 = new Thread(new Waiter2(m));
       w2.start();
       
       
       Thread n = new Thread(new Notifier(m));
       n.start();
	}

}
