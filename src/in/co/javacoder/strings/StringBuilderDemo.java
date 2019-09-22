package in.co.javacoder.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		/*
		 * System.out.println(sb.capacity());
		 * 
		 * sb.append("Sample String xt"); System.out.println(sb.capacity());
		 * sb.append(" text");
		 * 
		 * System.out.println(sb.capacity()); System.out.println(sb.length());
		 */
		
		
		/*
		 * for(char current = 'a'; current <= 'x'; current++) { sb.append(current); }
		 * System.out.println(sb);
		 */
		
		
		/*
		 * StringBuilder sb2 = new StringBuilder("start"); // "start"
		 * sb2.append("+middle"); // "start+middle" StringBuilder name =
		 * sb2.append("+end"); // "start+middle+end" System.out.println("sb2 : " + sb2);
		 * System.out.println("name : " + name); name.append("+postend");
		 * System.out.println("name : "+ name); System.out.println("sb2 : " + sb2);
		 */
		
		/*
		 * StringBuilder a = new StringBuilder("abc"); StringBuilder b = a.append("de");
		 * b = b.append("f").append("g");
		 * 
		 * System.out.println("a = " + a); System.out.println("b = " + b);
		 */
		
		/*
		 * StringBuilder sbA = new StringBuilder(); // creates a sb with default
		 * capacity 16 characters. StringBuilder sbB = new StringBuilder("animals"); //
		 * initial value. with default capacity 16 but length = 7 StringBuilder sbC =
		 * new StringBuilder(10); // creates a sb with capacity = 10
		 */
		
		/*
		 * sb.append("animals"); String sub = sb.substring(sb.indexOf("a"),
		 * sb.indexOf("al")); int len = sb.length(); char ch = sb.charAt(6);
		 * System.out.println(sub + len + ch);
		 */
		
		//append() method
		/*
		 * sb.append(1).append('c'); sb.append("-").append(true);
		 * System.out.println(sb);
		 */
		
		//insert method
		
		/*
		 * sb.append("animals"); sb.insert(7, "-"); // "animals-" sb.insert(0, "-"); //
		 * "-animals- sb.insert(4, "-"); System.out.println(sb);
		 */
		
		// delete method
		
		/*
		 * sb.append("abcdef"); // "abcdef" sb.delete(1, 3); // "adef"
		 * sb.deleteCharAt(5); // SOBE due to length of "adef" is four.
		 */
		
		/*
		 * sb.append("0123456789"); sb.delete(2, 8).append("-").insert(2, "+");
		 * System.out.println(sb);
		 */
		
		// reverse() method
		
		/*
		 * sb.append("ABC"); sb.reverse(); System.out.println(sb);
		 */
		
		// toString method
		/*
		 * sb.append("world # 4"); String s = sb.toString(); System.out.println(s);
		 */
		
		//sb.append("abcdefg");
		//System.out.println(sb.substring(6,3).length()); //String substring(start_index,end_index) where
		// start_index should be greater than the end_index. Otherwise, RE: StringIndexOutOfBoundsException : String index out of range -3
		
		
		/*
		 * sb.append("HelloWorld"); String hello = "HelloWorld"; sb = hello; // Type
		 * Mismatch hello = sb; // Type Mismatch
		 */		
		
		
		
	}

}
