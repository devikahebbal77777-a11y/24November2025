package javaPackage;

public class Static3 {
	
	int roll; //Global variable
	String name; // Global Variable
	static String college = "IIT Bombay"; // static variable
	
	public void getResult(int r, String n) {
		roll = r;
		name = n;
		System.out.println(r+ " "+ n + " " +college);
	}
	
	public static void main(String[] args) {
		
		Static3 s3 = new Static3();
		
		s3.getResult(1, "John"); // 1 John IIT Bombay
		s3.getResult(2, "Peter"); // 1 Peter IIT Bombay
		s3.getResult(3, "Alex"); // 1 Alex IIT Bombay
		
	}

}
