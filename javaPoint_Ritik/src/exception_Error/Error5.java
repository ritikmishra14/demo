package exception_Error;

public class Error5 {
	public static void divide() {
//		int a=50;
//		int b=5;
//		while(true) {
//		try {
//		int c=a/b;
//		System.out.println("value of c for valu of b as is: "+ c );
//		}
//		catch(Exception e) {
//			System.out.println(e);
//			break;
//		}
//		
//		finally {
//			System.out.println("Program end");}
//		}
//	}
}
		

	


	public static void main(String[] args) {
		// Finally Block in java.
		
//		Example-1
//		try {
//			System.out.println(25/5);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("finally block is always executed: ");
//		}
//		System.out.println("program end: ");
		
//		Example-2
//		try {
//			System.out.println(25/0);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("finally block is always executed ");
//		}
//		System.out.println("program end: ");
		int a=50;
		int b=5;
		while(true) {
		try {
		int c=a/b;
		System.out.println("value of c for valu of b as is: "+ c );
		}
		catch(Exception e) {
			System.out.println(e);
			break;
		}
		
		finally {
			System.out.println("Program end");}
		}
		b--;
	}

	}


