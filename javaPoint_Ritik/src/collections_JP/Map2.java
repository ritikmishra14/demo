package collections_JP;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class BookL{
	int id;
	String name;
	public BookL(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	
}

public class Map2 {

	public static void main(String[] args) {
		BookL b=new BookL(101,"Sky");
		BookL b1=new BookL(102,"Blue Sky");
		BookL b2=new BookL(102,"Ocean");
		
		LinkedHashMap<Integer,BookL> m=new LinkedHashMap<>();
		m.put(1, b);
		m.put(2, b1);
		m.put(3, b2);
		
//		System.out.println("Keys: "+ m.keySet());
//		System.out.println("Vlaues: "+ m.values().toString());
		
		for(Entry<Integer,BookL> e: m.entrySet()) {
			int key=e.getKey();
			System.out.println("details: "+ key);
			BookL b3=e.getValue();
			System.out.println(b3.id+" "+ b3.name);
			
		}

	}

}
