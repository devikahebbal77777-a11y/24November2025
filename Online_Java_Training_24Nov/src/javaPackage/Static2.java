package javaPackage;

public class Static2 {
	
	static int roll; //Declaring static variable
	static String name; // Declaring static variable
	String college = "IIM Indore"; //Defining Global variable
	int a = 10; // Defining Global Variable
	
	public static void main(String[] args) {
		
		Static2 s2 = new Static2();
		
		System.out.println(roll); // 0
		System.out.println(name); // null
		System.out.println(s2.college); // IIM Indore
		System.out.println(s2.a); // 10
	}

}
