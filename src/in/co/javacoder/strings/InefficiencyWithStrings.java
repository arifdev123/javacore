package in.co.javacoder.strings;

public class InefficiencyWithStrings {

	public static void main(String[] args) {
		String alpha = "";
		for(char current = 'a'; current <= 'z'; current++) {
			alpha += current; // it creates 26 garbage objects.
		}
		System.out.println(alpha);
	}

}
