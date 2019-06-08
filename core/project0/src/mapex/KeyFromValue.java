/*https://www.baeldung.com/java-map-key-from-value
*/
package mapex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class KeyFromValue {

	/*
	 * The Map interface of Java Collections offers a method called entrySet(). It
	 * returns all the entries or key-value pairs of the map in a Set. The idea is
	 * to iterate over this entry-set and return the key for which the value matches
	 * the supplied value:
	 */
	
	static String getKey1(Map<String,String> map, String value) {
		for (Entry<String, String> entry : map.entrySet()) {
			if(entry.getValue().equals(value)) {
				return entry.getKey();
			}
		}
		return null;
	}
	
	/*
	 * However, there might be a possibility that multiple keys are pointing to the
	 * same value. In that case, if a matching value is found, we add the key to a
	 * Set and continue the loop. In the end, we return the Set containing all the
	 * desired keys:
	 */
	static Set<String> getKeys(Map<String, String> map, String value){
		Set<String> keys = new HashSet<String>();
		
		for (Entry<String,String> entry : map.entrySet()) {
			if(entry.getValue().equals(value)) {
				keys.add(entry.getKey());
			}
		}
		return keys;
	}
	
	/*
	 * With the introduction of Lambda Expressions in Java 8, we can do it in a more
	 * flexible and readable way. We convert the entry-set to a Stream and supply a
	 * lambda to filter only those entries with the given value. Then we use the map
	 * method to return a Stream of the keys from the filtered entries:
	 */
	static Stream<String> getkeys1(Map<String, String> map, String value){
		return map
				.entrySet()
				.stream()
				.filter(entry -> value.equals(entry.getValue()))
				.map(Map.Entry::getKey);
	}
	
	
	
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value2");
		
		
		
//		System.out.println(getKey1(map, "value2"));
//		System.out.println(getKeys(map, "value2"));
		System.out.println(getkeys1(map, "value2"));
		
	}

}
