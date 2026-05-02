package javaPackage;

public class Variable9 {
	
	int b = 10; //Global Variable
	static int c = 5; // Static variable
	
	//static method
	public static void d() {
		int e = 15; //Local variable
		System.out.println(e); //15
	}

	//Non static method
	public void f() {
		int g = 11; //Local variable
		System.out.println(g); //11
	
	}
	
	public static void main(String[] args){
		int a =6; //Local variable
		System.out.println(a); //6 - calling variable
	
		
		//Static Member Calling
		System.out.println(c); //5 - calling variable directly in the same class - Predefined rule
		d();//15 - calling static method directly in the same class - Predefined rule
		
		// Non-static member calling
		Variable9 v9 = new Variable9();
		System.out.println(v9.b);//10 - Calling naon-static variable using class ref - Predefined rule
		v9.f();//11 - Calling non static method using class ref - Predefined rule
	}
	
}
