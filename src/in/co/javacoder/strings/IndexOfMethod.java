package in.co.javacoder.strings;

public class IndexOfMethod {

	public static void main(String[] args) {
		String name = "Anees Fathima Mohamed Ismail Arif Abdhiya Anees";
		
		System.out.println(name.indexOf('A')); // 0
		System.out.println(name.indexOf('a')); // 7
		System.out.println(name.indexOf('y')); // 39
		System.out.println(name.indexOf('x')); // -1
		System.out.println(name.indexOf('B')); // -1
		System.out.println();
		
		System.out.println(name.indexOf('A', 34)); // 34
		System.out.println(name.indexOf('a', 25)); // 25
		System.out.println(name.indexOf('y', 40)); // -1
		System.out.println(name.indexOf('x',10)); // -1
		System.out.println(name.indexOf('B', 35)); // -1
		System.out.println();
		
		System.out.println(name.indexOf("Abdhiya")); // 34
		System.out.println(name.indexOf("Anees")); // 0
		System.out.println(name.indexOf("fathima")); // -1
		System.out.println(name.indexOf("trichy")); // -1
		System.out.println();
		
		System.out.println(name.indexOf("Abdhiya", 0)); // 34
		System.out.println(name.indexOf("Anees", 20)); // -1
		System.out.println(name.indexOf("fathima", 30)); // -1
		System.out.println(name.indexOf("trichy", 34)); // -1
		System.out.println();
		
		
		

	}

}
