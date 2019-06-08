package collectionExamples;

/* The Collection API: (the collection - Concept - number of elements)
 * Collection - Interface
 * Collections - Class
 * 
 * Collection<E> is an interface which extends Iterable<E>
 * List is an interface which extends Collections 
 * ArrayList is a Class which implements List interface
 * */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionConcept {

	public static void main(String[] args) {
		int a[]= new int[4]; //fixed size
		
		Collection<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(2);
		values.addAll(values);
		
		System.out.println(values);
		
		Iterator it = values.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		List<Integer> list = new ArrayList<>();
		
//		Set<Integer> set = new ArrayList<>();
		
		
		
	}

}
