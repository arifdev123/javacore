package in.co.javacoder.strings;


class Tiger {}

public class Equality {

	public static void main(String[] args) {

		/*
		 * String greeting1 = "Hello"; String greeting2 = "Hello"; StringBuilder sbd1 =
		 * new StringBuilder("Hello"); StringBuilder sbd2 = sbd1.append("World");
		 * 
		 * 
		 * if(greeting1 == greeting2) System.out.println("greeting1 equals greeting2");
		 * if(sbd1 == sbd2) System.out.println("sbd1 equals sbd2");
		 * 
		 * 
		 * 
		 * if(sbd1.equals(sbd2)) System.out.println("sbd-1 equals sbd-2");
		 */
		
		// String literals are pooled. JVM reuses them. String is immutable meaning that the state of the object cannot be 
		// changed.
		/*
		 * String x = "Hello World"; String y = "Hello World"; System.out.println(x ==
		 * y); // true System.out.println(x.equals(y)); System.out.println("Hello World"
		 * == x); // true
		 * 
		 * String z = " Hello World".trim();
		 * 
		 * System.out.println(x == z); // false because at compile time, x and z are same. so it creates new string for z.
		 * .. // at runtime only trim() is called. Though it returns same value of "Hello World" which is not equals to x's reference.
		 * ..// The value returned by the trim() is created in the string pool.
		 */
		
		// Other than String class, does not implement the equals method , so equals method on objects of other classes
		// always check for the reference equality for example 
		
		
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		Tiger t3 = t2;
		
		if(t1 == t2 ) {
			System.out.println("t1 equals t2 ");
		} else {
			System.out.println("t1 not equals t2 ");
		}
		
		if(t1 == t3 ) {
			System.out.println("t1 equals t3 ");
		} else {
			System.out.println("t1 not equals t3 ");
		}
		
		if(t2 == t3 ) {
			System.out.println("t2 equals t3 ");
		} else {
			System.out.println("t2 not equals t3 ");
		}
	}

}


