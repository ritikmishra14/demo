package exception_Error;

import java.io.IOException;

class Calculate{
//	void add(int i, int j) throws Exception {
//		if(i<0 || j<0) {
//			try {
//			throw new ArithmeticException("Arithmatic exception occured");
//			}
//			catch(ArithmeticException e) {
//				System.out.println(e);
//			}
//		}
//		else {
//			System.out.println(i+j);
//		}
//		System.out.println("program end: ");
		
//	}
//	void n() throws Exception{
//		
//	}
	void m() throws ArithmeticException{
		
	}
	void n() throws IOException{
		
	}
}
public class Error7 {

	public static void main(String[] args) {
// Throw vs throws
		Calculate cal=new Calculate();
//		cal.add(10,20);
//		cal.n();
		cal.m();
		int a[]= {1,2};
		System.out.println(a[-1]);
		
	}

}
