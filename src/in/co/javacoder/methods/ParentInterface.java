package in.co.javacoder.methods;

public interface ParentInterface {

	default public void aDefaultMethod() {
		System.out.println("This is a default method from ParentInterface.");
	}
}
