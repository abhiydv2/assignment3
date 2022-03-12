package Assignment3;

public class MyThreadMain {

	public static void main(String[] args) Throws InterruptedException{
		// TODO Auto-generated method stub 
		Thread t1=new Thread(new MyThread1("message1"));
		Thread t2=new Thread(new MyThread1("message2"));
		Thread t3=new Thread(new MyThread1("message3"));
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
	}

	


}