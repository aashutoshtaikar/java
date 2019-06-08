package basics;

public class ArrayTable {

	public static void main(String[] args) {
		System.out.println("Index\tContents");
		
		int someValues[] = {55,2,44,77,33};
		for (int i = 0; i < someValues.length; i++) {
			System.out.println(i+"\t"+someValues[i]);
		}
	}

}
