package in.co.javacoder.overriding.methods.vararg;

public class TestPWithVarargAndCWithVararg {

	public static void main(String[] args) {
		
		PWithVararg p1 = new PWithVararg();
		p1.methodOneWithVararg(20);
		
		
		CWithVararg c1 = new CWithVararg();
		c1.methodOneWithVararg(30);
		
		PWithVararg p2 = new CWithVararg();
		p2.methodOneWithVararg(40);
	}

}
