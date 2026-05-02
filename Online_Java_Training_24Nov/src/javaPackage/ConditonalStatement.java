package javaPackage;

public class ConditonalStatement {

	public static void main(String[] args) {
		
		// if statement
		int a = 15; //Local variable		
		if(a > 10) {
			System.out.println("a is greater than 10");
		}
		
		// if else statement
		int b = 10; //Local Variable		
		if(b / 2 == 0) {
			System.out.println("Result of b is equal to zero");
		} else {
			System.out.println("Result of b is not equal to zero");
		}
		
		//if else if ladder statement
		int q = 300; // Local variable
		int w = 300; // Local variable
		if(q < w) {
			System.out.println("q is lesser");
		}else if (q == w) {
			System.out.println("q is equal to w");
		}else {
			System.out.println("q is greater than w");
		}
		
		//Nested if statement
		int age = 15; //Local variable
		int weight = 55; //Local variable
		
		//Outer if statement
		if(age > 18) {
			
			//Inner if statement
			if(weight > 50) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not Eligible");
			}
		}else {
			System.out.println("Age is not greater than 18");
		}
	}
}
