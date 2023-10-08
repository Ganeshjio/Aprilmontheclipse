package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNg_listner implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println("test case start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test case success");
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("test case failure");
		
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("test case skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("test case skipped");
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("test case failed");
	}

	public void onStart(ITestContext context) {
		
		System.out.println("test case start");
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("test case finish");
	}

}
