package collections_JP;

import java.util.*;

public class HashSet1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("list 1");
		list.add("list 2");
		HashSet<String> h1=new HashSet<>(list);
		h1.add("one");
		h1.add("two");
		h1.add("three");
		h1.add("four");
		h1.add("four");
		h1.add("four");
		
//		h1.remove("four");
		HashSet<String> h2=new HashSet<>();
		h2.add("ten");
		h2.add("eleven");
		
		h1.addAll(h2);
		
		h1.removeAll(h2);
		
		System.out.println("Iterating on the set: ");
		Iterator<String> itr=h1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
