package Assignment3;

public class Synchronization extends Thread {
	public synchronized void run() {
		//public void run() {
		for(int i=0;i<5;i++) {
			System.out.print(i);
		}
		System.out.println();
		}
}
