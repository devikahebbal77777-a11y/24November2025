package javaPackage;

public class Encapsulation2 extends Encapsulation1{
//	//final method cannot be override
//	public void d() {
//		
//	}
	
public static void main(String[] args) {
	Encapsulation2 e2 = new Encapsulation2();
	e2.setDetails("Selenium");
	System.out.println(e2.getDetails());
	e2.setDetails(5);
	System.out.println(e2.getDetails());
	}

}
