package javaPackage;

public class Inheritance4 extends Inheritance3{
	
	public void multiply(int x, int y) {
		z = x * y;
		System.out.println(z);	
    }
	
	public static void main(String[] args) {
		
		Inheritance4 i4 = new Inheritance4();
		
		int x = 20, y =10;
		
		i4.add(x,  y);//30
		i4.Substract(20, 15);// 5
		i4.multiply(x, y); //
	}
	
}
	
