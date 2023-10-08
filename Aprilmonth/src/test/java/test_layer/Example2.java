package test_layer;

import org.testng.annotations.Test;

public class Example2 {
	
	@Test(priority = 2 )
	public void login()
	{
		System.out.println("login sucessfully");
	}

	@Test(priority = 1 )
	public void home() {
		System.out.println("home page sucessfully");
	}

	@Test(priority = 3)
	public void contact1()
	{
		System.out.println("contact sucessfully");
		
	}
	
	


}
