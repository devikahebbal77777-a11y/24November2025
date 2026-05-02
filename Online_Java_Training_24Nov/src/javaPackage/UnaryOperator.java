package javaPackage;

public class UnaryOperator {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		
		System.out.println(a); //5
		System.out.println(a++); //5
		System.out.println(a); //6
		System.out.println(++a); //7
		System.out.println(a); //7
		System.out.println(a--); //7
		System.out.println (a--); //6
		System.out.println(a); // 5
		System.out.println(--a); //4
		System.out.println(a++ + ++a);//4, 5, 6, 6 = o/p = 10
		System.out.println(a + a++); // 6, 6, 7 = o/p = 12
		System.out.println(b++ + b--);// 5, 6, 6, 5 =o/p = 11
		System.out.println(b-- + ++b);//5, 4, 5, 5 = o/p = 10
		System.out.println(b-- + ++b); //5 , 4, 5, 5 = o/p = 10
		System.out.println(b); //5
		System.out.println(a++ + b++); // 7, 8, 5, 6 = o/p = 12
	}

}
