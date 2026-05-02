package javaPackage;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		//Exception handled - finally will execute always
		try {
			int j = 10 /0;	
		} catch (Exception e) {
			
		} finally {	
			System.out.println("finally executed - Exception also Handled");
		}
		
		//Exception is not handled - finally will execute always
		try {
			int i = 10 /0;	
		} finally {
			System.out.println("finally executed - Exception not Handled");
		}
		
//		//Exception handled - finally will execute always
//		try {
//			int j = 10 /0;	
//		} catch (Exception e) {
//			
//		} finally {	
//			System.out.println("finally will always execute - Exception also Handled");
//		}
		

	}

}
