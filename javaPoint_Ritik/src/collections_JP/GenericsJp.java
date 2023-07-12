package collections_JP;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Box<T>{
	T container;
	
	public Box(T container) {
		this.container=container;
		
	}
	public Object getValue() {
		return container;
		
	}
	public void performTask() {
		if (container instanceof String) {
			System.out.println("Length of string is: "+ ((String) this.container).length());
		}
		else {
			System.out.println("Not a String " + this.container);
		}
		
	}
}

public class GenericsJp {

	public static void main(String[] args) {
//		List list=new ArrayList();
//		list.add(10);
//		list.add("sam");
//		list.add('a');
//		
//		Iterator itr=list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//			}
// This is not type safe coding and will result in complex debugging.
		
//		type safety using Generics.
		
//		List<String> list2=new ArrayList<String>();
//		list2.add("10");
//		list2.add("sam");
//		list2.add("a");
//		
//		Iterator<String> itr1=list2.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr1.next());
//			}
		
		
//		Box class illustration for container.
		Box<String> b=new Box<String>("this is string");
//		b.container=123;
		System.out.println(b.getValue());
		System.out.println(b.container.getClass().getName());
		
		Box<Integer> b1=new Box<>(123);
		System.out.println(b1.getValue());
		System.out.println(b1.container.getClass().getName());
		
		b.performTask();
		b1.performTask();
		
		}
	
	


	
}
