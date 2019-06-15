package assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assignment11 {

//	11. Find out all the vowels in a String
	public static String findVowels(String str) {
		String vowelsFound ="";
		for (int i = 0; i<str.length(); i++) {
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i) == 'i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowelsFound += str.charAt(i) + ",";
			}
		}
		
		return vowelsFound;
	}
	
	public static String findVowelsUsingStream(String str) {
		Character[] vowels = {'a','e','i','o','u'};
		
		Set<Object> setOfVowels = new HashSet<>(Arrays.asList(vowels)); 
		
		//map to object - java8 boxing
		Character[] inputArray = str.chars().mapToObj(x -> (char)x).toArray(Character[]::new);
		
		Set<Object> inputSet = new HashSet<>(Arrays.asList(inputArray));
		inputSet.retainAll(setOfVowels);
		
		return "vowels found:" + inputSet.toString() + "\nsize:" + inputSet.size();
	}
	
	public static void main(String[] args) {
		String str = "ashuatosh";
		System.out.println(findVowels(str));
		System.out.println(findVowelsUsingStream(str));
	}

}
