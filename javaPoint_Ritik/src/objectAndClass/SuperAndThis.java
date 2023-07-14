package objectAndClass;
class Animal{
	String color;
	int age;
	Animal(String color,int age){
		this.color=color;
		this.age=age;
		System.out.println("Animal is created");
	}
//	void eat() {
//		System.out.println("animal is eating");
//	}
	
}
class Dog extends Animal{
	String color;
	int age;
	int no;
	
	
	Dog(String color, int age, int no){
		super(color,age);
		this.no=no;
		System.out.println("From Animals, dog is created");
	}
//	Dog(String color){
//		this.color=color;
//		System.out.println(color);
//	}
//	void eat() {
//		System.out.println("dog is eating");
//	}
//	void bark() {
//		System.out.println("dog is barking");
//	}
//	void work() {
//		super.eat();
//		eat();
//		bark();
//	}
	
}

public class SuperAndThis {

	public static void main(String[] args) {
		// Super keyword is used to get the data members of parent class. 
//		This is used to call current constructor or invoke data members of a class.
		
		Animal a=new Dog("Brown",12,1);
//		a.work();
		System.out.println(a.color+" "+ a.age);
		

	}

}
