package in.co.javacoder.staticflow;

public class StaticFlowTest3 {
	
	static {
		m1();
	}

	static void m1() {
		System.out.println(z);
	}
	
	static int z = 7;
	
	public static final void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
