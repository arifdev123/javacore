package in.co.javacoder.strings;

public class Substring {
	
	
	
	public static void main(String [] args) {
        String s1 = "This is some sample text or string used for demonstration of the usage of the substring method available in the core java api.";
       
        System.out.println(s1.substring(s1.indexOf("core")));
        System.out.println(s1.substring(30,80));
	}

}
