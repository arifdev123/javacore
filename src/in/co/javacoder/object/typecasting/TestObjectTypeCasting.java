package in.co.javacoder.object.typecasting;

public class TestObjectTypeCasting {

	public static void main(String[] args) {

		Base2 b = new Derived4();
		
		Object o = (Base2) b;   
		//Object o = (Base1) b;
		//Object o = (Derived3) b;
		//Base2 b1 = (Base1) b;
		//Base1 b1 = (Derived4) b;
		//Base1 b1 = (Derived1) b;
		
	}

}
