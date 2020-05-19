package in.co.javacoder.overriding.methods.throwss.exceptions;

public class MethodHidingTest {

	public static void main(String[] args) {
		P p = new P();
		p.m3();
		
		C c = new C();
		c.m3();
		
		P p1 = new C();
		p1.m3();
		
	}

}
