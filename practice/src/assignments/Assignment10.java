package assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment10 {

//	10. Identify the maximum consecutive 0's in a String
//	https://www.tutorialspoint.com/java/java_regular_expressions.htm
	public static String identifyConsecutiveZerosregEx(String str) {
		int max=0;
		String output="";
		
		Pattern pattern = Pattern.compile("0+"); //one or more than one 0's
		Matcher matcher = pattern.matcher(str);
		
		while (matcher.find()) {
			if (max < matcher.group().length()) {
				max = matcher.group().length();
			}
			output += matcher.group() + ",";
			
		}
		return "Matched:" + output + "\nMax 0's:" + max;
	}
	
	public static void main(String[] args) {
		String str = "10001001";
		System.out.println(identifyConsecutiveZerosregEx(str));
	}

}
