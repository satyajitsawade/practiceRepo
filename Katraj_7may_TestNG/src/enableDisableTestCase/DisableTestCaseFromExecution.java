package enableDisableTestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DisableTestCaseFromExecution {
	
	@Test (priority=1)
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	
	@Test ()
	public void testCase3() {
		System.out.println("Test Case 3");
	}
	
	// enabled= false will skip test from execution
	@Test (priority=-2, enabled=false)
	public void testCase2() {
		System.out.println("Test Case 2");
	}

}
