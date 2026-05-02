package javaPackage;

public class ExceptionalHandling2 {

	public static void main(String[] args) {
		
		// Handling NullPointerException
		String s = null;
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("NullPointerException Handled");
		}
		
		//System.out.println("NullPointerException Handled");
		
		// Handling NumberFormatException 
		String t = "Selenium";
		try {
			int i = Integer.parseInt(t);
		} catch (NumberFormatException e) {
			//printStackTrace();
			System.out.println("NumberFormatException handled");
		}
		//System.out.println("NumberFormatException handled");
		
		//Handling ArrayIndexOutOfBoundException
		int a[] = new int[5];
		try {
			a[7] = 50;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundException Handled");
		}
		
		//System.out.println("ArrayIndexOutOfBoundException Handled");
	}

}
