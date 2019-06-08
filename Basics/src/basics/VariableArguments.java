package basics;

public class VariableArguments {
	
	public static int average(int... numbers) {
		int total = 0;
		for(var i : numbers) {
			total += i;
		}
		return total/numbers.length;
	}
	
	public static void main(String[] args) {
		System.out.println(average(1,2,3,4));
	}

}
