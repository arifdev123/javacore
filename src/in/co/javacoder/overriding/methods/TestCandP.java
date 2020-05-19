package in.co.javacoder.overriding.methods;

public class TestCandP {

	public static void main(String[] args) {
		//P p = new P();
	//	p.m3();  // able to access parent class methods.
		//p.m5();
		
		//C c = new C();
		//c.m6();
	//	c.m4();
		
		//P p2 = new C();
		// p2.m6();
		// p2.m5();
		 
		 
		 //method hiding - static polymorphism
		 System.out.println("method hiding - static polymorphism");
		 P p3 = new P();
		 p3.m4();
		 
		 C c3 = new C();
		 c3.m4();
		 
		 P p4 = new C();
		 p4.m4();
		 
		 // method overriding - dynamic polymorphism
		 System.out.println("method overriding - dynamic polymorphism");
		 p3.m3();
		 c3.m3();
		 p4.m3();
		 

	}

}
