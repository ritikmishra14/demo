package multithreadingJava;
class Thread5 extends Thread{
	public void run() {
		int i=0;
		while(i<20) {
		System.out.println("Thread 5 is running..");
		i++;
		}
	}
	
}
class Thread51 extends Thread{
	
	
	public void run() {
		int i=0;
		while(i<20) {
			
			System.out.println("Thread 51 is running..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;;
		}
	}
	
}

public class Threading5_Cwh {

	public static void main(String[] args) {
Thread5 t=new Thread5();
Thread51 t1=new Thread51();
t.start();
try {
	t.join();
} catch (InterruptedException e) {
	e.printStackTrace();
}
System.out.println("------------------------------------");
t1.start();
}

}
