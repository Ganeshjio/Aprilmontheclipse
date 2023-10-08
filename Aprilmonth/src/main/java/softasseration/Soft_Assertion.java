package softasseration;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	
	@Test(enabled=false)
	
	public void test1()
	{
		System.out.println("-----ab----");
		Assert.assertEquals(30, 23);
		System.out.println("-----cd----");
		System.out.println("-----ef----");
	}
	
	@Test
	
	public void test2() // only object created then console shows the test case is pass
	{                   // but in actual test case is fail 
		                // print all printing statement
		                
		SoftAssert sa = new SoftAssert();
		
		System.out.println("-----ab----");
		sa.assertEquals(30, 23);
		System.out.println("-----cd----");
		System.out.println("-----ef----");
		
		sa.assertAll();  // while using assertAll then in console it's shows test case fail
		                 // print all printing statement  
	}
 
	 

}
