package javaPackage;

public class Variable5 {

//	public static void main(String[] args) {
//		int a1 =1;
//		System.out.println(a1);
//		
//		int a2 =2;
//		System.out.println(a2);
//		
//		int a3 =3;
//		System.out.println(a3);
//		
//		int a4 =4;
//		System.out.println(a4);
//		
//		int a5 =5;
//		System.out.println(a5);
//	}
	
	// Array
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5}; // int type array
		
		String b[] = {"John", "Devika"}; //string type array
		
		Object c[] = {1,2,3, "John", "Devika", 'a', 'b', 3>12, 10.5};
		
		System.out.println(a[0]); //1
		System.out.println(a[2]); //3
		System.out.println(a[1]); //2
		System.out.println(a[3]); //4
		System.out.println(a[4]); //5
		
		System.out.println(b[0]); //John
		System.out.println(b[1]); //Devika
		
		System.out.println(c[0]); // 1
		System.out.println(c[1]); // 2
		System.out.println(c[2]); // 3
		System.out.println(c[3]); // John
		System.out.println(c[4]); // Devika
		System.out.println(c[5]); // a
		System.out.println(c[6]); // b
		System.out.println(c[7]); // false
		System.out.println(c[8]); // 10.5
	}
}
