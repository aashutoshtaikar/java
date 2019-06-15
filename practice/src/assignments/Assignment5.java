package assignments;

//LinkedHashMap is used to store Map in unsorted order but maintains the order of insertion
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment5 {

//	5. Identify the first non-repeating character in a String	
	public static char getFirstNonRepChar(String str) {
		Map<Character, Integer> indexMap = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			if (indexMap.containsKey(str.charAt(i))) {
				Integer count = indexMap.get(str.charAt(i));
				count++;
				indexMap.put(str.charAt(i), count);
			}else {
				indexMap.put(str.charAt(i), 1);
			}
		}
		
		for (Character ch : indexMap.keySet()) {
			if (indexMap.get(ch)==1) {
				return ch;
			}
		}
		
		return '\0';
	}
	
	public static void main(String[] args) {
		System.out.println(getFirstNonRepChar("helloworld"));
	}

}
