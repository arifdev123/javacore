package in.co.javacoder.strings;

public class StringCreation {

	public static void main(String[] args) {
		
		String string = "animals";
		String stringNew = new String("animals");
		String emptyString = "";
		String String = "stringWithString7ClassName" ;
		
		System.out.println(string.hashCode());
		System.out.println(stringNew.hashCode());
		System.out.println(emptyString.hashCode());
		System.out.println(string == stringNew);
		System.out.println(string.toString());
		System.out.println(string.equals(stringNew));
		
		System.out.println(string.length()); // In case of a String object, length() is NOT a property but its a method that returns number of characters in it.
		System.out.println(args.length); // in case of arrays, length is a property that holds the number of elements in it.
		
		System.out.println("finding a number char in the string : at the index of 16 is  " + String.charAt(16)); // When index is out of the range, StringIndexOutOfBoundsException is thrown.
		
		System.out.println("Use of indexOf method " + string.indexOf('s'));
		System.out.println("Use of indexOf method " + string.indexOf('a',1));
		System.out.println("Use of indexOf method " + string.indexOf("als"));
		System.out.println("Use of indexOf method " + String.indexOf("With",3));
		
		
		
		
		
		
		
		
	}
}
