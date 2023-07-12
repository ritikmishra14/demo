package multithreadingJava;
class MyThread extends Thread{
	public void run() {
		int i=0;
		while(i<100) {
		System.out.println("Thread 1 is running");
		i++;
		}
	}
	public void notRun() {
		int i=0;
		while(i<100) {
			
			System.out.println("Thread 1 is not running");
			i++;
		}
	}
}
class MyThread1 extends Thread{
	public void run() {
		int i=0;
		while(i<100) {
		System.out.println("Thread 2 is running");
		i++;
		}
	}
	public void notRun() {
		int i=0;
		while(i<100) {
			System.out.println("Thread 2 is not running");
			i++;
			
		}
	}
}

public class Threading1_Cwh {

	public static void main(String[] args) {
		MyThread m1=new MyThread();
		MyThread1 m2=new MyThread1();
		m1.start();
		m2.start();
//		m1.notRun();
//		m2.notRun();
		

	}

}
