package javaPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//Create ArrayList
		ArrayList<Object> obj = new ArrayList<Object>();
		
		//Adding Object in ArrayList
		obj.add(1);
		obj.add("Selenium");
		obj.add(7.0);
		obj.add('a');
		obj.add(3 > 12);
		obj.addAll(Arrays.asList(99, 100, "Automation"));
		
		//Print ArrayList Element - 1st way
		System.out.println(obj);
		
		//Print ArrayList Element using for each loop
		for (Object b : obj) {
			System.out.println("for each loop: " + b);
		}

	}

}
