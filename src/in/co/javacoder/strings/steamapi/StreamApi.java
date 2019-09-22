package in.co.javacoder.strings.steamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		 intermediateOperations();
	}
	
	static void intermediateOperations() {
		// map
		System.out.println("Map stream : ");
		
		List<Integer> numbers = Arrays.asList(2,4,6,8,10);
		System.out.println(numbers);
		
		List<Integer> squares = numbers.stream().map(x-> x * x).collect(Collectors.toList());
		System.out.println(squares);
		
		
		//filter
		System.out.println("Filter stream : ");
		
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
		System.out.println(names);
		List<String> result = names.stream().filter(x -> x.startsWith("C")).collect(Collectors.toList());
		System.out.println(result);
		
		//filter
		System.out.println("sort stream : ");
		
		List<String> names2 = Arrays.asList("Reflection", "Collection", "Stream");
		System.out.println(names);
		List<String> result2 = names.stream().sorted().collect(Collectors.toList());
		System.out.println(result2);
	}
	
	static void teminalOperations() {
		
		
	}

}
