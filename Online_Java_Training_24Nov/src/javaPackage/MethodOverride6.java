package javaPackage;

public class MethodOverride6 extends MethodOverride5 {
	
	public void cook() {
		System.out.println("Sister is cooking");
	}
	
	public void angry() {
		System.out.println("Father is angry");
	}
	
	public static void main(String[] args) {
		
		MethodOverride5 mo5 = new MethodOverride6();
		
		mo5.cook();
		mo5.eat();
		mo5.handwash();
		//mo5.angry(); //Undefined because of dynamic method dispatched concept
		
		MethodOverride6 mo6 = new MethodOverride6();
		mo6.angry();
	}

}
