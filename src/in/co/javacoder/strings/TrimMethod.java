package in.co.javacoder.strings;

public class TrimMethod {

	public static void main(String[] args) {
		String space = " " ;
		String tab = "		";
		String newline = "\n";
		
		String text = newline + space + tab + "Arif" + tab + space + newline;
		System.out.println("before trimming.\n " + text);
		System.out.println("after trimming.\n ");
		System.out.println(text.trim());
	}

}
