package javaPackage;

public class Encapsulation1 {
	
	Object inputData; // Global Variable
	final int c = 2; // final variable
	
	public void a() {
		//c = 5; // final variable cannot change the value
	}
	
	// final method
	final void d() {
		System.out.println("Hello final method");
		
	}
	
	public void setDetails(Object s) {
		inputData = s;
	}
	
	public Object getDetails() {
		return inputData;
		
	}

}
