package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Assignment1 {
	
	//1. Find out a middle index of a character which appears 3 times in a string
	static Integer middleIndex(String str) {
		Map<Character, List<Integer>> indexMap = new HashMap<>();
		
		for (int i=0; i<str.length(); ++i) {
			if(indexMap.containsKey(str.charAt(i))) {
				List<Integer> temp=indexMap.get(str.charAt(i));
				temp.add(i);
				indexMap.put(str.charAt(i), temp);
			}else {
				indexMap.put(str.charAt(i), new ArrayList<Integer>(Arrays.asList(i)));
			}
		}
		System.out.println(indexMap);
		
		Iterator<Map.Entry<Character, List<Integer>>> itr = indexMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Character, List<Integer>> curr = itr.next();
			if (curr.getValue().size()==3) {
				return curr.getValue().get(1);
				
			}
		}
		
		for (Character ch : indexMap.keySet()) {
			if(indexMap.get(ch).size()==3) {
				return indexMap.get(ch).get(1);
			}
		}
		
		for (List<Integer> list: indexMap.values()) {
			if(list.size()==3) {
				return list.get(1);
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:");
		//String str = scanner.next(); //will take input upto whitespace
		String str = scanner.nextLine(); //will take whole line
		scanner.close();
		System.out.println(middleIndex(str));
	}

}
