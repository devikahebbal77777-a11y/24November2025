package javaPackage;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try 
		{
		int a = 5 / 0; //java.lang.ArithmeticException: / by
		}
		catch(ArithmeticException a) {
			a.printStackTrace(); //Print complete exception info
			System.out.println(a); //Print only Exception info
		}
		
	    catch(NullPointerException n) {
	    	System.out.println(n);
	    }
		
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println(b);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Exception Handled");

	}

}
