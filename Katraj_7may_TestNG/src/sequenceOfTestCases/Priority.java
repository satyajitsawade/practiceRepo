package sequenceOfTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Priority {
	// priority can be 0 negative,positive number
	// priority cannot be desimal number or variable
	// if priority is same then execution will be according to dictionary order of testCaseName
	// priority can be duplicate value same (same priority to multiple test cases)
	
	@Test (priority=1)
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	// default value of priority will be 0 it will run before positive numbers
	@Test ()
	public void testCase3() {
		System.out.println("Test Case 3");
	}
	
	@Test (priority=-2)
	public void atestCase2() {
		System.out.println("Test Case 2");
	}

}
