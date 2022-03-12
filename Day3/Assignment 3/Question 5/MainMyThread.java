package Assignment3;

public class MainMyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println("Main Thread starts...");
		Thread t1=new Thread(new PrintStack());
		Thread t2=new Thread(new PrintStack());
		t1.start();
		t2.start();
		System.out.println("Main Thread Ends...");
	}

	}


