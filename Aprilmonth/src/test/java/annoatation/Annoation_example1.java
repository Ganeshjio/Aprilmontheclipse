package annoatation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annoation_example1 {
	
	@BeforeMethod

	public void beforemethod()
	{
		System.out.println("before method");
		
	}
	
	@AfterMethod
	
	public void aftermethod()
	{
		System.out.println("After method");
	}
	
	@BeforeClass
	
	public void beforeclass() {
		
		System.out.println("Before class");
	}
	
	@AfterClass
	
	public void afterclass()
	{
	 System.out.println("After class");
	 
	}
	
	@BeforeTest
	
	public void beforetest()
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	
	public void aftertest() 
	{
		System.out.println("After test");
	}
	
	@BeforeSuite
	
	public void beforesuite() 
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	
	public void aftersuite()
	{
		System.out.println("After Suite");
	}
	
	@Test
	
	public void xyz()
	{
		System.out.println("xyz method");
	}
	
}
