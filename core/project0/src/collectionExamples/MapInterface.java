package collectionExamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	
	static void usingHashMap() {
		Map<String,String> map = new HashMap();
		map.put("myName", "Navin");
		map.put("actor", "John");
		map.put("ceo","Marrisa");
		map.put("myName", "Akshay");
		

		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " " + map.get(key));
		}
	}
	
	//hashtable is synchronized("thread safety")
	static void usingHashTable() {	
		Map<String,String> map = new Hashtable();
		map.put("myName", "Navin");
		map.put("actor", "John");
		map.put("ceo","Marrisa");
		map.put("myName", "Akshay");
		
		//System.out.println(map.get("myName"));
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " " + map.get(key));
		}
	}
	
	
	public static void main(String[] args) {
		//usingHashMap();
		usingHashTable();
	}

}
