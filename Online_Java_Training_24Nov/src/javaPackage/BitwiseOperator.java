package javaPackage;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 20;
		
		//Bitwise Operator - It will check all the condition
		System.out.println(a < b & a++ < c );// false, true = false
		System.out.println(a);// 11

	}

}
