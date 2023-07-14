package collections_JP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List<String> fruit =new ArrayList<>();
		fruit.add("mango");
		fruit.add("Lichi");
		fruit.add("Banana");
		fruit.add("Grapes");
		
		System.out.println("Sorting the list: ");
		Collections.sort(fruit);
		
		
		for(String fruits:fruit) {
			System.out.println(fruits);
		}
		
//		Converting array to list.
		//		String name[]= {"teju","shena", "shanu"," abhi"};
//		System.out.println("printing array: "+ Arrays.toString(name));
//		
//		List<String> nameList=new ArrayList<>();
//		for(String s: name) {
//			nameList.add(s);
//			
//		}
//		System.out.println("Printing List: "+ nameList);
		
//		Converting List to array.
		String fruitName[]=fruit.toArray(new String[fruit.size()]);
		System.out.println("sorting arrays: ");
		Arrays.sort(fruitName);
		System.out.println("Array of List: "+ Arrays.toString(fruitName));

	}

}
