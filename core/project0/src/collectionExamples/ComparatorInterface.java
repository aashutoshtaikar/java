package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//using a named class which implements Comparator
class Comp implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return (arg0%10 > arg1%10) ? 1 : -1;
	}
	
}

public class ComparatorInterface {
	
	//Collections static methods(sort,reverse..) examples
	 static void collectionsExample() {
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(5);
		values.add(3);
		
		Collections.sort(values);
		Collections.reverse(values); //list is mutable
		
		System.out.println(values);
		
		List<Integer> test = new ArrayList<Integer>(values);
		Collections.shuffle(values);
		System.out.println(test);
		System.out.println(values);
	}
	
	//sorting based on the last digit by overriding compare in comparator interface
	 static void comparatorInterface() {
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		
		//making object of an anonymous class
		Comparator<Integer> c = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if (i%10 > j%10) 
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(values, c);
		System.out.println(values);
		
	}
	 
	 static void comparatorInterface2() {
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		
		Comparator<Integer> c = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return (i%10 > j%10) ? 1 : -1;
			}
		};
		
		
		Collections.sort(values, c);
		System.out.println(values);
		
	}
	 
	 static void comparatorInterface3() {
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		
		//using lambda with explicit return
		Collections.sort(values, (i,j)-> {return i%10>j%10?1:-1;});
		System.out.println(values);
		
	}
	 
	 static void comparatorInterface4() {
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		
		//using lamda with implied return
		Collections.sort(values, (i,j)-> i%10>j%10?1:-1);
		System.out.println(values);
		
	}
	
	public static void main(String[] args) {
		
		comparatorInterface3();

	}

}
