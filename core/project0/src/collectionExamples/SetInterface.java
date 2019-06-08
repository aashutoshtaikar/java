package collectionExamples;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	static void usingHashset() {
		//HashSet stores in undefined order
		Set<Integer> unique_values = new HashSet<Integer>();
		
		unique_values.addAll(Arrays.asList(9,10,5));
		System.out.println(unique_values.add(87));
		System.out.println(unique_values.add(97));
		System.out.println(unique_values.add(34));
		System.out.println(unique_values.add(92)); 
		System.out.println(unique_values.add(87)); //already added in set, thus is not added
		
		
		
		System.out.println(unique_values);
	}
	
	static void usingTreeSet() {
		//TreeSet stores in ascending order
		Set<Integer> unique_values = new TreeSet<Integer>();
		
		unique_values.addAll(Arrays.asList(9,10,5));
		System.out.println(unique_values.add(87));
		System.out.println(unique_values.add(97));
		System.out.println(unique_values.add(34));
		System.out.println(unique_values.add(92)); 
		System.out.println(unique_values.add(87)); //already added in set, thus is not added
		
		
		
		System.out.println(unique_values);
	}
	
	public static void main(String[] args) {
		usingHashset();
		usingTreeSet();
	}

}
