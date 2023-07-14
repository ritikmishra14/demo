package objectAndClass;
 class Bike{
//	public static void speed() {
//		System.out.println("static method bike class ");
//	}
	void run() {
		System.out.println("Bike is running.");
	}
	}
class Hero extends Bike{
	
//	public static void speed() {
//		System.out.println("static method overriden");
//	}
	void run() {
		System.out.println("Splender bike is running with 60km/h: ");
	}
	}

public class PolyMorphism_JP {

	public static void main(String[] args) {
		// Final keyword is used to make variables, methods , class whose values cannot be changed.
//		Bike b=new Hero();
//		b.run();
//		Bank1 b1;
//		b1=new SBI1();
//		System.out.println("Sbi rate of interest: "+ b1.rateOfInterest());
//		b1=new ICIC1();
//		System.out.println("icic rate of interest: "+ b1.rateOfInterest());
//		b1=new AXIS1();
//		System.out.println("axis rate of interest: "+ b1.rateOfInterest());
//		Shape shape;
//		shape=new Rectangle();
//		shape.shape();
//		System.out.println(shape instanceof Rectangle);
//		System.out.println(shape.area);
//		shape=new Circle();
//		shape.shape();
//		System.out.println(shape.area);
//		shape=new Triangle();
//		shape.shape();
//		System.out.println(shape.area);
//		System.out.println(shape instanceof Shape);
//		Rectangle rec=(Rectangle)new Shape();
//		
//		
		
		
		
		
		
		
		
		

	}

}
//class Bank1{
//	public int rateOfInterest() {
//		return 0;
//}
//}
//	class SBI1 extends Bank1{
//		public int rateOfInterest() {
//			return 8;
//	}
//		
//		
//	}
//	class ICIC1 extends Bank1{
//		public int rateOfInterest() {
//			return 9;
//	}
//}
//	class AXIS1 extends Bank1{
//		public int rateOfInterest() {
//			return 10;
//	}
//}

class Shape{
	int area=0;
	void shape() {
		System.out.println("will draw shape of figures: ");
	}
}
class Rectangle extends Shape{
	int area=12;
	void shape() {
		System.out.println("Shape is Rectangle : ");
	}
	
}
class Circle extends Shape{
	int area=13;
	void shape() {
		System.out.println("Shape is Circle : ");
	}
	
}
class Triangle extends Shape{
	int area=14;
	void shape() {
		System.out.println("Shape is Triangle : ");
	}
	
}