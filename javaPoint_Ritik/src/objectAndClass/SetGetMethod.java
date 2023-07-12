package objectAndClass;
abstract class Car{
	String name;
	int id;
	public String getName(String name) {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId(int id) {
		return id;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	abstract void show(); 
		
	
}
class Thar extends Car{

	@Override
	void show() {
		System.out.println("Name: "+ name + ", Id: "+ id);
		
	}
	
}

public class SetGetMethod {

	public static void main(String[] args) {
		// In  this we will learn to improve setters and getters.
		
		Car car=new Thar() ;
		car.getId(1);
		car.setId(1);
		
		car.getName("Thar");
		car.setName("Thar");
		
		System.out.println("Name of car: "+ car.name);
		System.out.println("Id of car: "+ car.id);
		
		car.show();

		
		
		
		

	}

}
