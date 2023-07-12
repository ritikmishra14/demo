package multithreadingJava;
class MyThr4 extends Thread{
	public MyThr4(String name) {
		
		super(name);
	}
	public void run() {
		int i=0;
		while(i<40) {
			System.out.println( this.getName());
			i++;
		}
//		System.out.println("Thread 1 is running.");
	}
}

public class Threading4_Cwh {

	public static void main(String[] args) {
		
		// Priorities in threading.
		MyThr4 m=new MyThr4("Thread 1");
		MyThr4 m1=new MyThr4("Thread 2");
		MyThr4 m2=new MyThr4("Thread 3");
		MyThr4 m3=new MyThr4("Thread 4 (Most Important)");
		MyThr4 m4=new MyThr4("Thread 5");
		m4.setPriority(Thread.MAX_PRIORITY);
		m.start();
		m1.start();
		m2.start();
		m3.start();
		m4.start();

	}

}
