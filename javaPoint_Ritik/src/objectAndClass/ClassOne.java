package objectAndClass;
class Student{
	String name;
	int id;
	void display() {
		System.out.println("name: "+ name + ", id: "+ id);
	}
	
	
}
 

public class ClassOne {

	public static void main(String[] args) {
		Student student=new Student();
		student.name="charlie";
		student.id=21;
		student.display();
		
		new Student().display();
		new Calculation().fact(5);
		
		

	}

}
class Calculation{
	void fact(int number) {
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
		
	}
}
