package in.co.javacoder.strings;

public class MethodChaining {

	public static void main(String[] args) {
		String result = "AniMal  ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
		
		/*
		 *  As trim() , toLowerCase(), replace() methods invoked on strings and returns string values/objects. The method chaining is
		 *  possible. And the object of initial value and intermediate results are not referenced with string variables. so they are
		 *  are automatically qualify for the garbage collection. Any as so many objects are created immutably, they in efficient in terms
		 *  of memory management. So, java has a solution to this is StringBuilder class which is mutable unlike String class.
		 */
	}

}
