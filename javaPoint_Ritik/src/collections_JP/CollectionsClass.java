package collections_JP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class StudentC implements Comparable<StudentC>{
	String name;
	public StudentC(String name) {
		this.name=name;
		
	}
	@Override
	public int compareTo(StudentC o) {
		this.name.compareTo(name);
		return 0;
	}
}

public class CollectionsClass {

	public static void main(String[] args) {
//		List<String> list=new ArrayList<>();
//		list.add("Java");
//		list.add("advance java");
//		
//		System.out.println("without adding the list is: "+ list);
//		
//		Collections.addAll(list, "servlets","jsp");
//		
//		System.out.println("after adding the list is: "+ list);
//		
//		String str[]= {"c#", "Js"};
//		Collections.addAll(list, str);
//		Collections.sort(list,Collections.reverseOrder());
//		
//		System.out.println("after adding more: "+ list);
//		
//		System.out.println(Collections.max(list));
//		System.out.println();

//		Sorting the wrapper classes:
		
//		int a=23;
//		String s="123";
//		 int ss=Integer.parseInt(s);
//		Integer i=a;// wrapper classes
//		int b=12;
//		int c=8;
//		int d=100;
//		int e=34;
//		
//		ArrayList<Integer> al=new ArrayList<>();
//		al.add(ss);
//		al.add(b);
//		al.add(c);
//		al.add(d);
//		al.add(e);
//		Collections.sort(al);
//		
//		Iterator<Integer> itr=al.iterator();	
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		sorting user defined classes.
		
		StudentC s=new StudentC("broya");
		StudentC s1=new StudentC("shyam");
		StudentC s2=new StudentC("tejas");
		
		ArrayList<StudentC> a=new ArrayList<>();
		a.add(s);
		a.add(s1);
		a.add(s2);
		
		Collections.sort(a);
		for(StudentC a2: a) {
			String a3=a2.name;
			System.out.println(a3);
		}
		
		
	}

}
