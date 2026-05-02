package javaPackage;

public class MethodOverload3 extends MethodOverload2 {
	
	public static void main(String[] args) {
		
		MethodOverload3 mo3 = new MethodOverload3();
		mo3.sum(25, 15);//40
		mo3.sum(5, 12, 20);// 37
	}

}
