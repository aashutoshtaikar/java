package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListexample {

	static String findNumber(List<Integer> arr, int k) {
		
//		Iterator<Integer> it = arr.iterator();
//		
//		while(it.hasNext())
//		{
//			if(it.next().equals(k)) return "YES";
//		}
		
		for(int i : arr) {
			if(i==k) {
				return "YES";
			}
		}
		return "NO";
	}
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.addAll(Arrays.asList(1,2,3,4,5));
		
		System.out.println(findNumber(arr,1));

	}

}
