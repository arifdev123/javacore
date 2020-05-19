package in.co.javacoder.datatypes;

public class BinaryLiteral {

	public static void main(String[] args) {
		
		
		byte bin127 = 0b1111111;
		System.out.println(bin127);
		
		byte bin21 = 0b10101;
		System.out.println(bin21);
		
		byte bin148 = (byte)0b1001010;
		System.out.println(bin148);
		
		System.out.println(Boolean.valueOf(null));
		
		System.out.println((new Double(2)).intValue());
	}

}
