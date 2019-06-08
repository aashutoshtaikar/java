package inputOutput;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println(n);
	}
}
