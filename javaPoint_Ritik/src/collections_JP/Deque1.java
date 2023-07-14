package collections_JP;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Deque1 {

	public static void main(String[] args) {
		Deque<String> d=new ArrayDeque<>();
		d.add("Blue");
		d.add("black");
		d.add("green");
		d.add("yelllow");
		d.add("white");
		d.offerFirst("New first colour");
		d.offerLast("New last colour");
		
		d.pollLast();
		d.pollFirst();
		Iterator<String> itr=d.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
