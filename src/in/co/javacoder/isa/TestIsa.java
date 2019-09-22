package in.co.javacoder.isa;

public class TestIsa {

	public static void main(String[] args) {
		P p = new P();
		p.methodOne();
		//p.methodTwo();  // The method methodTwo() is undefined for the type P
		
		C c = new C();
		c.methodOne();
		c.methodTwo();
		
		P p1 = new C();
		p1.methodOne();
		//p1.methodTwo(); // The method methodTwo() is undefined for the type P
		
		//C c2 = new P();  // Type mismatch: Cannot convert from P to C.

	}

}
