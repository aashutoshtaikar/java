package mapex;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class unorderedvsOrdered {

	static void HashMap_TreeMap() {
		//Map is case sensitive
		Map<String,String> unorderedMap = new HashMap<>();
		unorderedMap.put("apple", "apple");
		unorderedMap.put("Mango", "mango");
		unorderedMap.put("bill", "Bill");
		unorderedMap.put("cart", "cart");
		unorderedMap.put("mango", "mango");
		
		for (var i : unorderedMap.entrySet()) {
			System.out.println(i.getKey() + " " + i.getValue());
		}
		System.out.println("------------------------\n");
		
		Map<String,String> orderedMap = new TreeMap<>();
		orderedMap.put("apple", "apple");
		orderedMap.put("Mango", "mango");// uppercase comes first in the ascending series
		orderedMap.put("bill", "Bill");
		orderedMap.put("cart", "cart");
		orderedMap.put("mango", "mango");
		
		
		for (var i : orderedMap.entrySet()) {
			System.out.println(i.getKey() + " " + i.getValue());
		}
	}
	
	public static void main(String[] args) {
		HashMap_TreeMap();
	}

}
