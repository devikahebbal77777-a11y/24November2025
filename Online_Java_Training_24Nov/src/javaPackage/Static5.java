package javaPackage;

public class Static5 {
	int x = 10; // Global variable
	static int y = 5; //static variable
	
	//Non -static method
	public void a () {
		int z = 10; //local variable
		System.out.println(z); //10
	}
	
	static int b = 6; //static variable
	
	//Static method
	public static void b() {
		int a = 5; //Local variable
		System.out.println(a); //5
	}
	
	public static void main (String[] args) {
		Static5 s5 = new Static5();
		s5.a(); //10
		Static4.z =100;
		System.out.println(Static4.z);//100
		System.out.println(s5.b);//6 - Not an appropriate way
		System.out.println(b);//6 - correct way
		b();//5
	}

}
