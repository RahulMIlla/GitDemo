package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test
	public void loan()
	{
		System.out.println("Rahul");
		System.out.println("Rahul");
	} 
	@Test
	public void loan2()
	{
		System.out.println("Murthy");
		System.out.println("Murthy");
	} 
	public void loan3()
	{
		System.out.println("Illa");
		System.out.println("Illa");
	} 
	@BeforeTest
	public void beforetest()
	{
		System.out.println("I will execute at  first of test"); 
		System.out.println("I will execute at  first of test"); 
	} 
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("I will execute before methods of class day2"); 
		System.out.println("I will execute before methods of class day2"); 
	} 
	@AfterClass
	public void afterclass()
	{
		System.out.println("I will execute after methods of class day2"); 
		System.out.println("I will execute after methods of class day2"); 
	} 
	
}
