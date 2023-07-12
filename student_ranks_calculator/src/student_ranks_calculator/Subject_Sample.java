package student_ranks_calculator;

import java.util.ArrayList;
import java.util.List;

class apple{
	String name;
	int price;
	public apple(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "name=" + name + ", price=" + price ;
	}
	
	
}


public class Subject_Sample {
	String city;
	int exp;
	List<apple> app;
	


	public Subject_Sample(String city, int exp, List<apple> app) {
		super();
		this.city = city;
		this.exp = exp;
		this.app = app;
	}




	@Override
	public String toString() {
		return "city=" + city + ", exp=" + exp + ", " + app ;
	}




	public static void main(String[] args) {
		List<apple> list=new ArrayList<apple>();
		list.add(new apple("Mango",130));
		list.add(new apple("Orange",140));
		list.add(new apple("Banana",150));
		
		Subject_Sample x1=new Subject_Sample("Mumbai", 2022, list);
		Subject_Sample x2=new Subject_Sample("delhi", 2023, list);
		
		System.out.println(x1);
		System.out.println(x2);
		
		
	}
	
	

}
