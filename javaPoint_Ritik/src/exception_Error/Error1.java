package exception_Error;

public class Error1 {

	public static void main(String[] args) {
		// Basic of exception handling in this class.
		int a=9;
		int b=0;
		try {
			String s="123";  
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
		catch(Exception e1) {
			System.out.println(e1);
		}
		System.out.println("Program End");

	}

}
