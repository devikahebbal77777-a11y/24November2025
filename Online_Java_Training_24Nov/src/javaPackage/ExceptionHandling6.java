package javaPackage;

import java.util.Scanner;

public class ExceptionHandling6 {
	
	public static void a(int age) throws Exception{
		
		try {
			if(age < 18) {
				throw new ExceptionHandling5CustomException("Age is less than 18 - Not Eligible");
			} else {
				System.out.println("Eligible");
			}
		} catch (ExceptionHandling5CustomException e) {
			e.printStackTrace();
			System.out.println("Age is less than 18 - But Exception Handled");
		}
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int b = sc.nextInt();
		a(b);
		System.out.println("Hello Custom Exception");
	}

}
