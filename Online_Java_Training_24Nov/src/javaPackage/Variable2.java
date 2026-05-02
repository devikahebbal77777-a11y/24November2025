package javaPackage;

public class Variable2 {

	public static void main(String[] args) {
		
		int a = 5; //Defining int type local variable
		System.out.println(a); //5 - Calling 'a' variable
		
		int x = 100; //Defining int type local variable
		System.out.println(x); //100
		
		x = 200; // int should not be used because here the value is modified
		System.out.println(x); // 200
		
		x = 300;
		System.out.println(x); // 300
		
		x = 400;
		System.out.println(x); // 400
		
		char c = 'a'; //char type local variable, should be placed inside single quote
		System.out.println(c);
		
		boolean b = true;
		System.out.println(b);// true
		
		b= false;
		System.out.println(b);
		
		System.out.println(3 > 12);
		
		int e = 100; // int type local variable
		int f = 200; //int type local variable
		
		boolean z = e > f;
		System.out.println(z); //false
	}

}
