package basicsOne;

import java.util.Scanner;

public class Objects1 {

	public static void main(String[] args) {
		int number1=6;
		int number2= 8;
		
//		int min=(number1>number2)?number1:number2;
//		System.out.println(min);
		
//		java assignment operator.
		int number3=87;
		number3 +=3;
		System.out.println(number3);
		number3 *=2;
		System.out.println(number3);
		
		number3 /=3;
		System.out.println(number3);
		number3 -=7;
		System.out.println(number3);



		
		
		
		
		
	
		
		
		
		
		


	}
	
	
	
}
 class score{
	String name;
	int id;
	float average;
	
	public void showScore() {
		System.out.println("Hi..."+name+ id + average);
		System.out.println("enter a number ");
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		System.out.println(a1);
		
		
	}

}

