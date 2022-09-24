package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listernersss implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Listener on Test Start ",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Listener on Test Success ",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Listener on Test Failure ",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Listener on Test Skipped ",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("Listener on Test failed but within success percentage ",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("Listener on Test Failed with timeout ",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Listener on Start ",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Listener on Finish",true);
	}
	
	
}
