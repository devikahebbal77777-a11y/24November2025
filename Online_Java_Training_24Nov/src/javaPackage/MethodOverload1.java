package javaPackage;

public class MethodOverload1 {
	
	public void aMethod(int a) {
		System.out.println("int Parameter");
		
	}
	
	public void aMethod() {
		System.out.println("No Parameter");
		
	}
	
	public void aMethod(int a, String b) {
		System.out.println("2 Parameters");
		
	}
	
	public static void main(String[] args) {
		MethodOverload1 mo1 = new MethodOverload1();
		mo1.aMethod();
		mo1.aMethod(5);
		mo1.aMethod(5, "Devika");
	}
}
