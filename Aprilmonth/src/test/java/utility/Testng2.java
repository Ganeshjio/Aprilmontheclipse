package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testng2 implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println("test case start");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test case pass");
			}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("test case false");
		}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("test case skip");
			}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	
	
	

}
