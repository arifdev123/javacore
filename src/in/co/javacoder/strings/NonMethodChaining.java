package in.co.javacoder.strings;

public class NonMethodChaining {

	public static void main(String[] args) {
		String start = "AniMaL   ";
		String trimmed = start.trim(); // "AniMal"
		String lowercase = trimmed.toLowerCase();  // "animal"
		String result = lowercase.replace('a', 'A');  // "Animal"
		
		// In non method chaining method is normal approach of calling methods and we need a number of variables to store initial value such start
		// and intermediate results such as trimmed, lowercase and final result such as result.
		
		System.out.println(result);
		
		// And String is not mutable object, in the above case, four string objects are created. All of them are immutable. Still they are
		// referenced by the string variables such as start, trimmed, lowercase, result and which are not qualified for the garbage collection.
		// This is on other hand is , inefficient memory management. because we only need final results. 
		

	}

}
