package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment8 {
	
//	8. String str = "1110001111001110010000011110101";
//	Count of 0's & 1's
	public static String countof1sAnd0s(String str) {
		int countofOnes=0, countOfZeros = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='1') {
				countofOnes++;
			}else if(str.charAt(i)=='0'){
				countOfZeros++;
			}
		}
		
		return new String("Count of 1's:"+countofOnes+ "\nCount of 0's:"+countOfZeros);
	}
	
	public static String countof1sAnd0swithMap(String str) {
		Map<Character, Integer> indexMap = new HashMap<Character, Integer>();
		
		int countofOnes=0, countOfZeros = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (indexMap.containsKey(str.charAt(i))) {
				Integer temp = indexMap.get(str.charAt(i));
				temp++;
				indexMap.put(str.charAt(i), temp);
			}else {
				indexMap.put(str.charAt(i), 1);
			}
		}
		
		for (Character ch : indexMap.keySet()) {
			if(ch=='1') {
				countofOnes = indexMap.get(ch);
			} else if(ch=='0'){
				countOfZeros = indexMap.get(ch);
			}
		}
		
		return new String("Count of 1's:"+countofOnes+ "\nCount of 0's:"+countOfZeros);
	}
	
	public static void main(String[] args) {
		String str = "110011000";
		System.out.println(countof1sAnd0s(str));
		System.out.println();
		System.out.println(countof1sAnd0swithMap(str));
	}

}
