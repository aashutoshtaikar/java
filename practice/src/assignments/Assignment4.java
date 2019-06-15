package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment4 {
	
//	4. Idfentify all the duplicate characters in a String
//	Ex: helloworld - l, o
	static String identifyDuplicateChars(String str) {
		Map<Character,Integer> indexMap = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			if(indexMap.containsKey(str.charAt(i))) {
				Integer count = indexMap.get(str.charAt(i));
				count++;
				indexMap.put(str.charAt(i), count);				
			}else {
				indexMap.put(str.charAt(i), 1);
			}
		}
		
		String duplicateChars = "";
		for (Character ch: indexMap.keySet()) {
			if(indexMap.get(ch)>1) {
				duplicateChars += ch;
			}
		}
		
		return new String("duplicate charachters: "+duplicateChars);
	}
	
	public static void main(String[] args) {
		System.out.println(identifyDuplicateChars("helloworld"));
	}
}
