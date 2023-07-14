package objectAndClass;

public class MethodTopic {
	int id;
	static void show() {
		System.out.println("show the static method..");
	}
	public int getId(int id){
		this.id=id;
		return id;
		
	}
	public void setId(int id) {
		this.id=id;
		
	}

	public static void main(String[] args) {
		// Static method in Java.
//		It is the method which is of Class not of object the class can access it and no need to create objects of the class.
		
		show();
		MethodTopic numbers=new MethodTopic();
//		int sum=numbers.add(12, 13);
//		System.out.println("calling instance method add: "+ sum);
		numbers.getId(123);
		System.out.println(numbers.id);
		
		numbers.setId(124);
		System.out.println(numbers.id);
		
		
		
		
	}
//	instance method.
//	public int add(int a, int b) {
//		int result=a+b;
//		return result;
//	}

}
