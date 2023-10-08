package assration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssration {
	
	String city;
	@Test
	
	public void equal()
	{
		int a =10;
		int b =20;
		int c =a+b;
		System.out.println(c);
		Assert.assertEquals(c, 30);
	}
	
	@Test
	public void notequal()
	{
		int a =10;
		int b =20;
		int c =a+b;
		System.out.println(c);
		Assert.assertNotEquals(c, 50);
	}
	
	@Test
	public void true1()
	{
		boolean a = 20>10;
		Assert.assertTrue(a);
	}
	
	@Test
	public void false1()
	{
		boolean a = 20>40;
		Assert.assertFalse(a);
	}
	
	@Test
	
	public void null1()
	{
		
		Assert.assertNull(city);
	}
	
	@Test
	public void notnull()
	{
		String city = "pune";
		Assert.assertNotNull(city);
	}

}
