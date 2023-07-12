package exception_Error;


public class Error6 {
	static void m () throws ArithmeticException {
		throw new ArithmeticException("Arithmatic exception occured in m");
	}
	static void n() throws Exception{
		try {
		m();
		}
		catch(Exception e) {
			System.out.println("Exception caught in n ");
		}
	}
	static void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception caught in p ");
		}
	}
//	public static void validate(int age) {
//		if(age<18) {
//			
//			throw new ArithmeticException("Age should be greater than 18: ");
//			
//		}
//		else {
//			System.out.println("allowed to vote");
//		}
//	}
public static void main(String[] args)  {
}
}
