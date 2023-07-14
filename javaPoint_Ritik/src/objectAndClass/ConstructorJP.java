package objectAndClass;


public class ConstructorJP {
	String name;
	int id;
	char value;
	
	 ConstructorJP() {
		System.out.println("default constructor: ");
	}
	 ConstructorJP(String name,int id){
		 this();
		 this.name=name;
		 this.id=id;
		 System.out.println("Parameterized constructor: "+ name+", "+ id);
	 }
	 ConstructorJP(String name,int id,char value){
		 this();
		 this.name=name;
		 this.id=id;
		 this.value=value;
		 System.out.println("Parameterized constructor: "+ name+", "+ id+", "+ value);
	 }
	 ConstructorJP(ConstructorJP c1){
	name=c1.name;
	id=c1.id;
	value=c1.value;
	System.out.println("copy constructor"+ name);
	 }

	public static void main(String[] args) {
		// constructors are way to declare the instance variable of a class.
//ConstructorJP object1=new ConstructorJP();
ConstructorJP object2=new ConstructorJP("sam",123);
ConstructorJP object3=new ConstructorJP("Alex",123,'a');
ConstructorJP object1=new ConstructorJP(object3);


	}

}
