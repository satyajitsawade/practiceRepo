package sequenceOfTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class CheckingTestCaseSequence {
	
	// execution will be done as per dictionary order of testCase name
	@Test
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	
	@Test
	public void atestCase2() {
		System.out.println("Test Case 2");
	}

}
