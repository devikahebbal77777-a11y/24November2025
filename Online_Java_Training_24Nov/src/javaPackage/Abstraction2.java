package javaPackage;

public class Abstraction2 extends Abstraction1 {
//Abstract class unimplemented method can be implemented by creating another Abstract class by inheriting the class
	@Override
	public void eat() {
		System.out.println("Please eat");

	}
	
	public static void main(String[] args) {
		Abstraction2 ab2 = new Abstraction2();
		ab2.eat();
		ab2.a();
	}
	

}
