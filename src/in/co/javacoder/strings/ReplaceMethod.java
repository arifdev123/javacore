package in.co.javacoder.strings;

public class ReplaceMethod {
  public static void main(String args[]) {
	  String text = "This is just a sample text used for the replace method demonstration. And this is just a simple paragraph of text that can be manipulated by various string manipulation methods available in the core java APIs.";
	  System.out.println(text.replace(" is", " was").replace('a', 'A'));
  }
}
