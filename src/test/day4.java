package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {

	
	@Test
	public void CarMobLoginLoan()
	{
		System.out.println("CarMobLoginLoan");
	}
	
	@Test
	public void CarWebLoginLoan()
	{
		System.out.println("CarWebLoginLoan");
	}
	
	@Test
	public void CarApiLoginLoan()
	{
		System.out.println("CarApiLoginLoan");
	} 
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("I am no 1");
	}
}
