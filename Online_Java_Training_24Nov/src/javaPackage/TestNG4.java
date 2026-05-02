package javaPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {
	
	// 1st way to skip the test script
	
	//@Test
	public void a() {
		System.out.println("Hello a test method");
	}
	
	// 2nd way to skip the test script - Widely used in market
	
	@Test(enabled = false)
	public void b() {
		System.out.println("Hello b test method");
	}
	
	@Test(enabled = true)
	public void c() {
		System.out.println("Hello c test method");
	}
	
	//Rerun Script - 2 Times
	@Test(invocationCount = 2)
	public void d() {
		System.out.println("Hello d test method");
	}
	
	//invocation count - 0 times
	@Test(invocationCount = 0)
	public void e() {
		System.out.println("Hello e test method");
	}
	
	//Conditional Skipping
	@Test
	public void f() {
		System.out.println("Hello f test method");
		throw new SkipException("Skipping f test method");
	}

}
