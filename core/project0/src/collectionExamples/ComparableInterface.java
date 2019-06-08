package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// implemeting comparable<Stud> for our class to work with Collections.sort()
class Stud implements Comparable<Stud>{
	int rollno, marks;
	String name;
	
	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	//overriding method (of Object)
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}


	//overriding method (of Comparable interface) ascending order
//	@Override
//	public int compareTo(Stud arg0) {
//		return marks>arg0.marks?1:-1;
//	}
	
	//sorting based on name length
	@Override
	public int compareTo(Stud arg0) {
		return name.length()>arg0.name.length()?1:-1;
	}

	
}

public class ComparableInterface {

	public static void main(String[] args) {
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23, "Mahesh", 70));
		studs.add(new Stud(24, "ahesh", 65));
		studs.add(new Stud(25, "hesh", 90));
		
		Collections.sort(studs);
		for (Stud stud : studs) {
			System.out.println(stud);
		}
		System.out.println();
		
		Collections.sort(studs,(i,j)->(i.marks>j.marks?1:-1));
		for (Stud stud : studs) {
			System.out.println(stud);
		}
	}

}
