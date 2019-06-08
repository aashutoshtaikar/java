/*https://javatutorial.net/java-iterate-hashmap-example
*/
package mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratingThruMap {

	static void iterateMap1() {
		//using for each
		Map<String,String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	static void iterateMap2() {
		//using lambda
		Map<String,String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		
		map.forEach((key,value)->{System.out.println(key + " " + value);});
	}
	
	static void iterateMap3() {
		//using Iterator
		Map<String,String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		
		Iterator<Entry<String,String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			//var e = it.next();
			//Map.Entry<String, String> e = (Map.Entry<String, String>) it.next();
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}	
	}
	
	
	
	public static void main(String[] args) {
//		iterateMap1();
//		iterateMap2();
		iterateMap3();
	}

}
