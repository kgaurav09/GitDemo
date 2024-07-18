package TestListners;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("This is a test scenario: On testStart "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("This is a test scenario: onTestSuccess "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("This is a test scenario: onTestFailure "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("This is a test scenario: onTestSkipped "+result.getName());
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("This is a test scenario: onTestFailedButWithinSuccessPercentage "+result.getName());
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("This is a test scenario: onTestFailedWithTimeout "+result.getName());
	}

	
	
	

}
