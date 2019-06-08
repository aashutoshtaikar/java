package mapex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	
	static void usingHashMap() {
		Map<String,String> map = new HashMap();
		map.put("myName", "Navin");
		map.put("actor", "John");
		map.put("ceo","Marrisa");
		map.put("myName", "Akshay");
		
		//extracting keys in a set
		Set<String> keys = map.keySet();
		
		// iterating thru the set getting value using map.get(key)
		for (String key : keys) {
			System.out.println(key + " " + map.get(key));
		}
	}
	
	
	public static void main(String[] args) {
		usingHashMap();
	}

}
