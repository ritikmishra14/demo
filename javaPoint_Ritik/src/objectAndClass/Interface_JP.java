package objectAndClass;
interface Printable{
	void print();
	int printArea(int a);
}
interface Showable{
	void print();
}
class Item implements Printable,Showable{

	@Override
	public void print() {
		System.out.println("printing the inputs is needed not showing so using print method of printable.");
	}

	@Override
	public int printArea(int a) {
		// TODO Auto-generated method stub
		return a;
	}
	
}
interface Draw{
	void draw();
}
class Square implements Draw{

	
	public void draw() {
		System.out.println("drawing square ");
		
	}
	
}
class Hexagon implements Draw{

	@Override
	public void draw() {
		System.out.println("drawing hexagon :");
		
	}
	
}
public class Interface_JP {

	public static void main(String[] args) {
//		Interface is used to achieve 100 percent abstraction.
		Item i=new Item();
		i.print();
		i.printArea(12);
		System.out.println(i.printArea(13));
		
		Draw shape;
		shape=new Square();
		shape.draw();
		
		shape=new Hexagon();
		shape.draw();
		

	}

}
