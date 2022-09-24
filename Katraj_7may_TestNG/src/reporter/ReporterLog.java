package reporter;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLog {
	
	@Test (priority=1)
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	
	@Test ()
	public void testCase3() {
		System.out.println("Test Case 3");
	}
	
	@Test (priority=-2)
	public void checkReporterLog() {
		// when true will be printed in console and emailabe report both
		Reporter.log("Reporter log with true", true);
		// when false will be printed in emailabe report only 
		Reporter.log("Reporter log with false", false);
	}

}
