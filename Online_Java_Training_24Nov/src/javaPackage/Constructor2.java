package javaPackage;

public class Constructor2 {
	
	int id; // Global variable
	String name;// Global variable
	String address; // Global variable
	
	//Default Constructor
	Constructor2(){
		System.out.println("Hello Default Constructor");
	}
	
	//Parameterized Constructor
	Constructor2(int a, String b, String c) {
		id = a;
		name = b;
		address = c;
	}
	
	//Non - static method
	public void displayInfo() {
		System.out.println(id + " "+ name+" "+address);
	}
	
	public static void main(String[] args) {
		//Default Constructor
		Constructor2 c2 = new Constructor2();
		
		//Parameterized Constructor
		Constructor2 c3 = new Constructor2(1,"John","India");
		c3.displayInfo();
		Constructor2 c4 = new Constructor2(2,"Alex","India");
		c4.displayInfo();
	}

}
