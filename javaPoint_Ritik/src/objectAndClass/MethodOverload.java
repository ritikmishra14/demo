package objectAndClass;
// Method Overriding.
class Bank{
	int rateOfInterest() {
		return 0;
				}
}
class SBI extends Bank{
	@Override
	int rateOfInterest() {
		
		return 8;
	}
}
class HDFC extends Bank{
int rateOfInterest() {
		
		return 7;
	}
	
}

public class MethodOverload {
//	static int add(int a, int b) {
//		return a+b;
//		
//	}
//	static float add(float a, float b,float c) {
//		return a+b+c;
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//int sum=MethodOverload.add(11, 11);
//double sum1=MethodOverload.add(11, 11,11);
//System.out.println(sum);
//System.out.println(sum1);
		SBI sbi=new SBI();
		HDFC hdfc=new HDFC();
		System.out.println(sbi.rateOfInterest());
		System.out.println(hdfc.rateOfInterest());
	}

}
