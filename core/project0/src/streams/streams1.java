package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;


public class streams1 {

	//1. simple int stream with range and forEach illustration
	static void streamsExample1() {
		IntStream
			.range(0, 12)
			.forEach(System.out::println);
	}
	
	//2. integer stream with skip and forEach with Lambda
	static void streamsExample2() {
		IntStream
			.range(0, 13)
			.skip(4)
			.forEach(x->System.out.print(x + " "));
	}
	
	//3. integer stream with sum
	static void streamsExample3() {
		System.out.println(
			IntStream
				.range(1, 5)
				.sum()
		);
	}
	
	//4. Stream.of - can pass any object, sorted and findFirst 
	static void streamsExample4() {
		Stream.of("Bacon","Carrot","Ash")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);
	}
	
	// 5. Array.Stream, filter, sort and print
	static void streamsExample5(){
		String temp[] = {"Al", "Ankit", "Kushal", "Brent" ,"Sarika", "Amanda","Hans", "Shivika", "Sagar", "Xeon"};
		
		Arrays.stream(temp)		//same as Stream.of
			.filter(x -> x.startsWith("S"))
			.sorted()
			.forEach(System.out::println);

		//temp remains unchanged
		for (String string : temp) {
			System.out.println(string);
		}
	}
	
	// 5. using Stream.of
	static void streamsExample51() {
		String temp[] = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda","Hans", "Shivika", "Sagar", "Xeon"};
		Stream.of(temp)
			.filter(x -> x.startsWith("S"))
			.forEach(System.out::println);
		
		for (String string : temp) {
			System.out.println(string);
		}
	}
	
	//6. average for the int array
	static void streamsExample6() {
		Arrays.stream(new int[] {1,2,3,4,5})
			.average()
			.ifPresent(System.out::println);
	}
	
	//6.1 average of squares for the int array
	static void streamsExample61() {
		Arrays.stream(new int[] {1,2,3,4,5})
			.map(x -> x * x)
			.average()
			.ifPresent(System.out::println);
	}
	
	static void streamsExample7() {
		List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda","Hans", "Shivika", "Sagar", "Xeon");
		
		people
			.stream()
			.map(String::toLowerCase)
			.filter(x -> x.startsWith("a"))
			.forEach(System.out::println);	
	}
	
	//store stream to a list
	static void streamsExample71() {
		List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda","Hans", "Shivika", "Sagar", "Xeon");
		
		List<String> outputPeople = people
							.stream()
							.map(String::toLowerCase)
							.filter(x -> x.startsWith("a"))
							.collect(Collectors.toList());
	
		System.out.println(outputPeople);
	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		streamsExample71();
	}

}
