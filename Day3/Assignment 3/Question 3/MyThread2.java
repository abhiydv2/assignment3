package Assignment3;

public class MyThread2 extends Thread{
	@Override
	public void run() {
		Thread t= Thread.currentThread();
		System.out.println("Priority of "+t.getName()+" is "+t.getPriority());
	}
}
