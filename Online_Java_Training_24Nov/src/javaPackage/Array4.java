package javaPackage;

public class Array4 {

	public static void main(String[] args) {
		//Defining Multi-Dimentional Array
		int a[][] = {{ 1, 2 },{ 3, 4, 5 },{ 6, 7, 8, 9 }};
		
		//Total number of rows
		int row = a.length; //length is property of an array
		System.out.println(row); //3
		
		//Total number of columns for each row
		for (int i = 0; i < row; i++) {
			System.out.println(a[i].length);
		}
		
		//Print all values
		//Outer loop
		for(int i = 0; i < row; i++) {
			
			//inner loop
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
