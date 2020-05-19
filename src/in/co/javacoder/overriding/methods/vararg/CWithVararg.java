package in.co.javacoder.overriding.methods.vararg;

public class CWithVararg extends PWithVararg {
	public void methodOneWithVararg(int x) { // name says vararg method but it actually does not have a vararg but with
												// normal int param
		System.out.println(
				"CWithVararg methodOneWithVararg int x (non vararg) is invoked."
				+ "\n Note: vararg method can not be overrided with a method has same method name but different arg list."
				+ "\n Though this seems to be method overriding actually it is not overriding actually. But it is overloading. "
				+ "\n This is the firt time I come to know that methods can be overloaded not only in the same class but also in the child class.");
	}
}
// TestPWithVarargAndCWithVararg