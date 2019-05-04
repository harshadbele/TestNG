package First_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_Demo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("on test start:"+result.getName());	
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Hurray test successful"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("oops test is  failed"+result.getName());	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("sorry this test is skipped"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
}
