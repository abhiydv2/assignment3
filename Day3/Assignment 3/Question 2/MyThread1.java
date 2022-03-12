package com.exception.Assignment;

public class MyThread1 implements Runnable{
	private String message;

	public MyThread1(String message) {
	this.message = message;
}

	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(this.message);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
