package in.co.javacoder.arrays;

import java.util.Arrays;

public class ArraysDemo {
	
	private int[] num;

	public static void main(String[] args) {
		int[] numbers1 = new int[3];
		System.out.println(numbers1);
		
		int[] numbers2 = new int[] {45,34,23};
		System.out.println(numbers2);
		
		int[] numbers3 = {10, 20, 30 }; // Anonymous means it knows its type and size are inferred so no need of having int[3] {}
		System.out.println(numbers3);

		
		int[] num1 = null; 	// System.out.println(num1); local variables should be initialized before used.
		int [] num2 = null; 	// System.out.println(num2);  local variables should be initialized before used.
		int[]num3 = null; 		// System.out.println(num3); local variables should be initialized before used.
		int num4[] = null; 	// System.out.println(num4); local variables should be initialized before used.
		int num5 []  = null; 	// System.out.println(num5); local variables should be initialized before used.
		
		String[] names = {"Arif", "Anees", "Abdhiya" };
		String alias[] = names;
		System.out.println(names.toString());
		System.out.println(names.equals(alias));
		System.out.println(names.equals(numbers2));
		
		String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings = new StringBuilder(); // Incompatible types
		//objects[0] = new StringBuilder(); // be careful
		
		
		String[] mammals = {"monkey", "chimp", "donkey"};
		System.out.println(mammals.length); // 3
		System.out.println(mammals[0]);
		System.out.println(mammals[1]);
		System.out.println(mammals[2]);
		
		//Number[] n = new Double[2];
		//n[0] = 3; // RE : ArrayStoreException n[0] can only hold Double type but passing 3 type. 
		//n[0] = "hello"; // CE: here Number or Double have no relationship with String "hello", it says type mismatch exception. Cannot convert from String to Number.
		
		String [] birds = new String[6];
		System.out.println(birds.length);
		
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i+ 5;
		System.out.println(numbers[i]);
		}
		
		numbers[9] = 3; 
		
		numbers[numbers.length-1] = 5 ;
		for(int i = 0 ; i < numbers.length; i++) numbers[i] = i + 5; 
		
		//System.out.println(numbers.length = 0); CE : The final field array.length cannot be assigned
		
		Arrays.sort(numbers);
		System.out.println(numbers.toString());
		for(int n : numbers) {
			System.out.println(n);
		}
		
		
		
		
		
		
		
		
	}

}
