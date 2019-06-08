package collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListInterface {

	//raw type arraylist
	static void ListExample1() {
		List values = new ArrayList();
		values.add(1);
		values.add(2);
		values.addAll(values);
		values.add("asd");
		
		for (int i = 0; i < values.size(); i++) {
			System.out.print(values.get(i) + " ");
		}
		System.out.println("\n");
		
		for (Object object : values) {
			System.out.print(object + " ");
		}
		System.out.println();
	}
	
	static void ListExample2() {
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(2);
		values.addAll(values);

		
		for (int i = 0; i < values.size(); i++) {
			System.out.print(values.get(i) + " ");
		}
		System.out.println("\n");
		
		for (Object object : values) {
			System.out.print(object + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

//		ListExample1();
		ListExample2();
	}

}
