package test_layer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example3 {
	

	@Test(priority = 1 )
	public void login()
	{
		System.out.println("login sucessfully");
	}

	@Test(invocationCount = 3 , priority = 2 )
	public void home() {
		System.out.println("home page sucessfully");
	}

	@Test(priority = 3)
	public void contact1()
	{
		System.out.println("contact sucessfully");
		
		Assert.fail();  // this comand use to test case fail
		
	}
		


}
