package in.co.javacoder.overriding.methods;

public class P {
	
	public static void m1() { System.out.println("P static m1"); } // static method can not be overrided as non static or instance method in the child class C.
	
	public void m2() { System.out.println("P non-static m2");} // non-static or instnace method cannot be overrided as static method in the chiled class C.
	
	public void m3() {System.out.println("P non-static m3");} // this is non-static method can be overrided in the child class with instance/ non-static method in class C.
	
	public static void m4() { System.out.println("P static m4 ");} // this is static method can same method signature in the child class C. but it is not said to be method overriding it is method hiding. Method overriding is applicable only on instance methods(in parent class ) to intance methods ( in the child class).
	
	public void m6() { System.out.println("P non static m6");}
}
