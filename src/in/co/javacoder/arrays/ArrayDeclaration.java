package in.co.javacoder.arrays;

public class ArrayDeclaration {

	public static void main(String[] args) {
		//int inno[5][5] = new int[5][5];
		int []i[];
		int [][]a;
		int[][] c;
		int[] [] d;
		int[]e[];
		
		int arr1[][] = new int[5][5];
		int []arr2[] = new int[5][5];
		int[][] arr3 = new int[5][5];
		
		// int[] arr4 = new int[5][]; // java.lang.Error: Unresolved compilation problem: Type mismatch: cannot convert from int[][] to int[]
		
		//int[] arr5 = new int[][5]; // java.lang.Error: Unresolved compilation problem: Type mismatch: cannot convert from int[][] to int[]
		
		//int[][] arr6 = new int[][5];  // java.lang.Error: Unresolved compilation problem:  Cannot specify an array dimension after an empty dimension

		int[][] arr7 = new int[5][];
	}

}
