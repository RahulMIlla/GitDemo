package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day1 {
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I am no 1 from last");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("I will execute at last of test");
	}
	@AfterMethod
	public void afteremethod()
	{
		System.out.println("I will execute after every method in day 1 class");
	}
	@Test 
	public void hello() { 
		System.out.println("Hello");
	} 
	
	@Test
	public void hello2() {
		System.out.println("my name is"); 
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I will execute before every method in day 1 class");
	}
}
