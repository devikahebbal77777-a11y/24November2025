package javaPackage;

public class Inheritance10 extends Inheritance8 {
	
	public void run() {
		System.out.println("I am running");
	}
	
	public static void main(String[] args) {
		Inheritance10 i10 = new Inheritance10();
		i10.eat();
		i10.run();
	}

}
