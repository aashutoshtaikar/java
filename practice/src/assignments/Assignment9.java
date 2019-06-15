package assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {

	//9. Identify the pairs of 10
	public static void identifyPairsof10(String str) {
		
	}
	
	public static String identifyPairsof10regEx(String str) {
		int count=0;
		String output="";
		
		Pattern pattern = Pattern.compile("10|01");
		Matcher matcher = pattern.matcher(str);
		
		while (matcher.find()) {
			output += matcher.group() + ",";
			count++;
		}
		return "Matched:" + output + "\ncount:" + count;
	}
	
	public static void main(String[] args) {
		String str = "01101101111001";
		System.out.println(identifyPairsof10regEx(str));
	}

}
