import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Assignment13 {

//	13. Split a string without using split()
	public static void splittingWithoutSplit(String str, int index) {
		StringTokenizer stringTokenizer = new StringTokenizer(str,""+str.charAt(index));
		
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}

//	https://www.techiedelight.com/convert-list-to-array-java/
//	13. Split a string without using split()
	public static String[] splittingWithoutSplit1(String str, int index) {
		List<String> listOfStrings = new ArrayList<String>();
		
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (i==index+1) {
				temp = "";
			}
			
			if (i <= index) {
				temp += str.charAt(i);
			} else if (i > index){		
				temp += str.charAt(i); 
			}
			
			if(i==index || i == str.length()-1){
				listOfStrings.add(temp);			
			}
		}
		
		return listOfStrings.stream().toArray(String[]::new);
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(splittingWithoutSplit1("abcdefgh", 3)));
	}

}
