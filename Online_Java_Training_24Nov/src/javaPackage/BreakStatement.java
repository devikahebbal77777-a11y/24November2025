package javaPackage;

public class BreakStatement {

	public static void main(String[] args) {
		
		//using for loop
		for(int i = 1; i < 5; i++) {
			//if statement
			if(i == 3) {
				break; // break loop
			}
			System.out.println(i);
		}
		System.out.println("===================End of for loop ===================");
		
		//using while loop 
		int j = 1; //local variable
		while(j<5) {
			if (j == 3) {
				break;
			}
			System.out.println(j);
			j++;
		}
		System.out.println("===================End of while loop ===================");

	}

}
