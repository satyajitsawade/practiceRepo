package invocationCount;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountToRepeatTestCase {
	
	@Test (priority=1)
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	
	// if we want to execute a particular test multiple times then we should use invocationCount keyword
	@Test (invocationCount=10)
	public void testCase3() {
		Reporter.log("Satyajit", true);
	}
	
	
	@Test (priority=-2)
	public void testCase2() {
		System.out.println("Test Case 2");
	}


}
