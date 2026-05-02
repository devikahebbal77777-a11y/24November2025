package javaPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void a2() {
		System.out.println("Hello a2 test method");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("Hello before test method");
	}
	
	@BeforeSuite
	public void c() {
		System.out.println("Hello before suite method");
	}
	
	@AfterMethod
	public void d() {
		System.out.println("Hello after method");
	}
	
	@BeforeClass
	public void e() {
		System.out.println("Hello before class method");
	}
	
	@AfterTest
	public void f() {
		System.out.println("Hello after test method");
	}
	
	@AfterClass
	public void g() {
		System.out.println("Hello class after method");
	}
	
	@BeforeMethod
	public void h() {
		System.out.println("Hello before method");
	}
	
	@AfterSuite
	public void i() {
		System.out.println("Hello after suite method");
	}
	
	@Test
	public void a1() {
		System.out.println("Hello a1 test method");
	}
	
	@Test
	public void B1() {
		System.out.println("Hello B1 test method");
	}

}
