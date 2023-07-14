package collections_JP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
class StudentAl1{
	int rollNo;
	String name;
	int age;
	public StudentAl1(String name, int rollNo, int age) {
		this.name=name;
		this.age=age;
		this.rollNo=rollNo;
		
	}
	public String toString() {
		return "Name: "+ this.name + "/ Age: "+ age+"/ Roll no: "+ rollNo;	
				}
}

public class ArrayList1_Jp {

	public static void main(String[] args) {
List<String> l=new ArrayList<>();
l.add("A");
l.add("B");
l.add("C");
l.add("D");
List<String> l1=new ArrayList<>();
l1.add("A");
l1.add("B");
l1.add("new 3");

//
//System.out.println(l);
		
//// Travsersing through iterator();
		
//System.out.println("traversing using iterator");
		
//Iterator<String> itr=l.iterator();
//while(itr.hasNext()) {
//	System.out.println(itr.next());
//}
//System.out.println("traversing using for each loop");
//for(String s: l) {
//	System.out.println(s);
//}
//
//System.out.println("Get method: "+ l.get(2));
//
//System.out.println("set method: "+ l.set(2, "Changed"));
//System.out.println(l.get(2));
//
//System.out.println("Sorting using collections..");
//
//List<Integer> l2=new ArrayList<>();
//l2.add(21);
//l2.add(34);
//l2.add(1);
//l2.add(78);
//
//Collections.sort(l2);
//
//System.out.println("sorted list: "+ l2);
		
//		Student class list;
		
//		StudentAl1 s1=new StudentAl1("dem", 12, 18);
//		StudentAl1 s2=new StudentAl1("demmy", 13, 19);
//		StudentAl1 s3=new StudentAl1("demo", 14, 18);
//
//List<StudentAl1> l1=new ArrayList<>();
//l1.add(s1);
//l1.add(s2);
//l1.add(s3);
//
//Iterator<StudentAl1> itr=l1.iterator();
//while(itr.hasNext()) {
//	System.out.println(itr.next());
//}

// Add method;
//l.add(2, "Added element");
//l.addAll(l1);
//l.retainAll( l1);
//Iterator<String> itr=l.iterator();
//while(itr.hasNext()) {
//	System.out.println(itr.next());
//}
	}

}
