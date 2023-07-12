package objectAndClass;
interface Animal1{
	public void creature();
	void eating();
	void living();
}
abstract class Person implements Animal1{
	abstract void identity();
	void valueOfLife() {
		System.out.println("As a Person my value in life is that be Kind, work on yourself , live a good life.");
	}
public void creature() {
	System.out.println("human creature: ");
}
}

class Male extends Person{

	
	void identity() {
		System.out.println("I belong to male family of Person..");
		
	}


	public void eating() {
		
		
	}

	
	public void living() {
		
	}
}
	class Female extends Person{

		
		void identity() {
			System.out.println("I belong to female family of person");
		}

	
		public void eating() {
			
			
		}

	
		public void living() {
		
			
		}
		
	}
	
	abstract class Bank1{
		public Bank1() {
			System.out.println("An organisation to better your financial burden");
			
		}
		abstract int rateOfInterest();
		
	}
	class PNB extends Bank1{

		@Override
		int rateOfInterest() {
			
			return 8;
		}
		
	}
	class BOI extends Bank1{

		@Override
		int rateOfInterest() {
			
			return (int)7.9;
		}
		
	}
	


public class AbstractionJP {

	public static void main(String[] args) {
		Person p1=new Male();
		p1.identity();
		p1.valueOfLife();
		Person f1=new Female();
		f1.identity();
		f1.valueOfLife();
		Bank1 b;
		b=new PNB();
		System.out.println("rate of interest is: "+ b.rateOfInterest());
		b=new BOI();
		System.out.println("rate of interest is : "+ b.rateOfInterest());
	}

}
