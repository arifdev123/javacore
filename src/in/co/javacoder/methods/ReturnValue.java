package in.co.javacoder.methods;

public class ReturnValue {

	public static void returnNothing() {
		System.out.println("This method declared with return type void but it still has a return statement but returns nothing");
		return;
	}
	public static void existingMethodUsingReturnKeyword(int age) {
		
		if(age == 18 ) System.out.println("You are not a minor");
		if(age < 1 ) return; // No O/P
		if(age > 0 && age < 126 ) return; // No O/P 
		if(age > 125 ) System.out.println("You are too old ! But you are very experianced person in the world !");
	}
	
	public static double returnType() {
		float b = 3;
		
		return b;
	}
	
	/*
	 * public static float returnType() {
	 * 
	 * }
	 */
	
	public static Number returnANumber() {
		return new Integer(8);
	}
	
	/*
	 * public static Integer returnANumbers() {
	 * 
	 * return (Short)56; }
	 */
	public static void main(String[] args) {
		returnNothing();
		
		existingMethodUsingReturnKeyword(0);
		existingMethodUsingReturnKeyword(18);
		existingMethodUsingReturnKeyword(99);
		existingMethodUsingReturnKeyword(128);

	}

}
