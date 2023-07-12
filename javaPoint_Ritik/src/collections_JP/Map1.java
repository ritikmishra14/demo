package collections_JP;

//import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//import java.util.Set;
//class BookM{
//	int id;
//	String name;
//	public BookM(int id, String name) {
//		this.id=id;
//		this.name=name;
//		
//	}
//	
//}

public class Map1 {

	public static void main(String[] args) {
//		BookM b=new BookM(101,"Sky");
//		BookM b1=new BookM(102,"Blue Sky");
//		BookM b2=new BookM(102,"Ocean");
//		
//		HashMap<Integer,BookM> m=new HashMap<>();
//		m.put(1, b);
//		m.put(2, b1);
//		m.put(3, b2);
//		
//		for(Entry<Integer, BookM> e: m.entrySet()) {
//			int key=e.getKey();
//			System.out.println(key+" Details: ");
//			BookM b3=e.getValue();
//			System.out.println(b.id+" "+ b.name);
//		}
				//		Map<Integer,String> m=new HashMap<>();
		
//		m.put(11, "First");
//		m.put(3, "none");
//		m.put(2, "suppose");
//		m.put(20, "heya");
//		m.put(12, "hindrence");
//		m.put(12, "hindrence two");
//		m.put(null, null);
//		m.put(null, "two");
//		m.putIfAbsent(45, "Put if absent");
//		
//		Map<Integer,String> m11=new HashMap<>();
//		m11.put(101, "New One");
//		m11.put(102, "New two");
//		m11.put(103, "New three");
//		
//		m.entrySet().stream().sorted(Map.Entry.comparingByKey());
//		
//		m.putAll(m11);
//		m.remove(null);
//		m.remove(12, "hindrence two");
//		m.replace(3, "Not None");
//		
//		System.out.println("iterating hashmap\n");
//		
//		for(Entry<Integer, String> m1: m.entrySet()) {
//			System.out.println(m1.getKey()+" "+ m1.getValue());
//	}		
		
		Map<Integer,String> m11=new HashMap<>();
		m11.put(101, "New One");
		m11.put(102, "New two");
		m11.put(103, "New three");
		
//	for(Entry<Integer, String> e: m11.entrySet()) {
//		System.out.println(e.getKey()+" "+ e.getValue());
//	}
	Iterator itr=m11.entrySet().iterator();
	
	while(itr.hasNext()) {
		
		
		System.out.println(itr.next());
		itr.remove();
//		System.out.println(itr.next());
	}
	System.out.println(m11);

}
}
