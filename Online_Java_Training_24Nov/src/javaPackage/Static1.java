package javaPackage;

public class Static1 { 
	
	int x = 500; //Global variable
	String s = "Hello"; // Global variable
	static int y = 100; // static variable
	
	//static method
	public static void method1() {
		String x = "Hi"; // Local Variable
		System.out.println(x); //Calling x variable
		
	}
	
	//Non -Static method
	public void method2() {
		int i = 100; //Local variable
		System.out.println(i);
	}

}
