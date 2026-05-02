package javaPackage;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int a = 10; // Local variable
		int b = 5; // Local variable
		int c = 20; // Local variable
		
		//Logical Operator - if 1st condition is false, 2nd condition will not check
		System.out.println(a < b && a < c);// false
		System.out.println(a); // 10

	}

}
