package javaPackage;

public class LoopConcept {

	public static void main(String[] args) {
		
		//for loop
		for (int i =1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("=================== End of for loop ===================");
		
		//for each loop - for array traversing
		Object a[] = {"Selenium", 10.5, 3 > 12, 'c', 5};
		//Print an array using for each loop
		for(Object b : a) {
			System.out.println(b);
		}
		System.out.println("=================== End of for each loop ===================");
		
		//while loop
		int i = 10; //Local variable
		while(i < 15 & i < 12 ) {
			System.out.println(i);
			i++;
		}
		System.out.println("=================== End of while loop ===================");
		
		//do while loop
		int d = 1; //Local variable
		do {
			System.out.println(d);
			d++;
		} while (d < 5);
		
		System.out.println("===================End of do while loop ===================");
	}

}
