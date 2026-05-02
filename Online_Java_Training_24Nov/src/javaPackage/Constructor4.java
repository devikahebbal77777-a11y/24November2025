package javaPackage;

public class Constructor4 {
	
	//Constructor Overloading
	Constructor4(){
		System.out.println("No Parameter");
	}
	
	Constructor4(int n){
		System.out.println("int Parameter");
	}
	
	Constructor4(String s){
		System.out.println("String Parameter");
	}
	
	public static void main(String[] args) {
		Constructor4 c3 = new Constructor4(); //No Parameter
		Constructor4 c4 = new Constructor4(1); //int Parameter
		Constructor4 c5 = new Constructor4("Selenium"); //String Parameter
	}

}
