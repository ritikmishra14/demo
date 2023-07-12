package multithreadingJava;
class Browser implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i<40) {
			System.out.println("Browser is running");
			i++;
			
		}
	}
	
}
class MsWord implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i<40) {
			System.out.println("Ms word  is editing document");
			i++;
			
		}
	}
	
}
public class Threading2_Cwh {

	public static void main(String[] args) {
		Runnable b=new Browser();
		Runnable m=new MsWord();
		Thread t1=new Thread(b);
		Thread t2=new Thread(m);
		t1.start();
		t2.start();

	}

}
