package objectAndClass;
class Student1{
	static int count=0;
	String name;
	int roll;
	static int cubeValue;
	static String college="Sxc";
	
	static void change() {
		college="Nit";
	}
	static int cube(int x) 
	{
		cubeValue=x*x*x;
//		int cube=x*x*x;
		return cubeValue;
	}
	
	public Student1(String name, int roll){
		
		this.name=name;
		this.roll=roll;
		count++;
System.out.println(count);
	}
	void display() {
		System.out.println(name+" "+ roll + " "+ college +" " + count);
		System.out.println("cube: +" + cubeValue);;
	}
	
}
public class PracticeOne {

//	static{System.out.println("hi");}
	public static void main(String[] args) {
		Student1.change();
		Student1.cube(2);
		Student1 s=new Student1("tejas", 21);
		s.display();
		Student1 s1=new Student1("sham",65);
		s1.display();
		Student1 s2=new Student1("kavya",12);
		
		s2.display();

	}

}
