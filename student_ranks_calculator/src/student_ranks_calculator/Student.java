package student_ranks_calculator;

import java.util.ArrayList;
import java.util.List;

public class Student{
	String Name;
	int Roll_No;
	List<Subject> subject;
	  int percentage;
	 
	 public static int cal(List<Subject> sub) {
		 int c= sub.get(0).Subject_Marks + sub.get(1).Subject_Marks+sub.get(2).Subject_Marks;
		 int d=(c*100)/300;
		 return d;
	 }
	
	
	
	public Student(String name, int roll_No, List<Subject> subject) {
		super();
		Name = name;
		Roll_No = roll_No;
		this.subject = subject;
		this.percentage=(subject.get(0).Subject_Marks + subject.get(1).Subject_Marks+subject.get(2).Subject_Marks)*100/300;
	}
	@Override
	public String toString() {
		return "StudentName=" + Name + ", Roll_No=" + Roll_No +" => " + subject+ "Percentage= "+ percentage;
	}
	











	

	public static void main(String[] args) {
		


		List<Subject> l1=new ArrayList<Subject>();
		l1.add(new Subject("Maths", 56));
		l1.add(new Subject( "Physics", 65));
		l1.add(new Subject("Chemistry",96));
		
	
		
		
		
		List<Subject> l2=new ArrayList<Subject>();
		l2.add(new Subject("Maths", 80 ));
		l2.add(new Subject( "Physics", 71));
		l2.add(new Subject("Chemistry",87));
		
		List<Subject> l3=new ArrayList<Subject>();
		l3.add(new Subject("Maths", 87 ));
		l3.add(new Subject( "Physics", 40));
		l3.add(new Subject("Chemistry",87));
		
		
		
//	Student s1=new Student("Ritik", 1, l1 );
//		Student s2=new Student("Rohan", 2, l2);
//		Student s3=new Student("Rounak", 3, l3);
		
		Student[] array=new Student[3];
		array[0]= new Student("Ritik", 1, l1 );
		array[1]=new Student("Rohan", 2, l2);
		array[2]=new Student("Rounak", 3, l3);
		
		sort(array);

		
		
		
		
		
		 
		

		
		}
	public static void sort( Student k[]) {
		
		for(int i=0;i<k.length;i++) {
			Student temp;
			for(int j=i+1;j<k.length;j++) {
				if(k[i].percentage<k[j].percentage) {
					temp=k[i];
					k[i]=k[j];
					k[j]=temp;
					
				}
				
				
			}
			
			
		}
		int a[]= {1,2,3};
		
		for(int i=0;i<k.length;i++) {
			System.out.println("Rank-> "+a[i]+ "= " + k[i]);
		}
		
		
		
	}
	}

		
		
		
		
		
			
			
		
		
		
		
		
	
	







