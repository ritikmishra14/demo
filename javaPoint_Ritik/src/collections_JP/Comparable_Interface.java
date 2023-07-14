package collections_JP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentCo {
	String name;
	int age;
	public StudentCo(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	public String toString() {
		return "[name: "+ name +" "+ ", age: "+ age+" ]";
	}
	public int compareTo(StudentCo s) {
		if(this.age>s.age) {
			return -1;
		}
		else if(this.age<s.age) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
class AgeCompare implements Comparator<StudentCo>{

	@Override
	public int compare(StudentCo o1, StudentCo o2) {
		if(o1.age>o2.age) {
			return 1;
			
		}
		else if(o1.age<o2.age) {
			return -1;
		}
		else {
		return 0;
		}
	}
	
}
class NameCompare implements Comparator<StudentCo>{

	@Override
	public int compare(StudentCo o1, StudentCo o2) {
		o1.name.compareTo(o2.name);
		return 0;
	}
	
}

public class Comparable_Interface {

	public static void main(String[] args) {
		StudentCo s=new StudentCo("brian",34);
		StudentCo s1=new StudentCo("christan",30);
		StudentCo s2=new StudentCo("susan",14);
		
		List<StudentCo> list=new ArrayList<>();
		list.add(s);
		list.add(s1);
		list.add(s2);
		
//		Collections.sort(list, new AgeCompare());
//		System.out.println("sorting using age: ");
//		System.out.println(list);
		
		System.out.println("sorting using name: ");
		Collections.sort(list, new NameCompare());
		System.out.println(list);
		

	}

}
