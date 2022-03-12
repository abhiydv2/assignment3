package Assignment3;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hread t1=new Thread(new MyThread("message1"));
		Thread t2=new Thread(new MyThread("message2"));
		Thread t3=new Thread(new MyThread("message3"));
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
	}
	}


