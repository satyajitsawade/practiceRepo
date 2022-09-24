package dependsOnMethods;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependantTestCase {
	
	// It allows test case to be depend on other test case,
	// if other test case get pass then only it’s dependent method will get execute 
	// otherwise it would be consider as skipped test case
	
	@Test (priority=1, dependsOnMethods="testCase3")
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	
	@Test ()
	public void testCase3() {
		System.out.println("Test Case 3");
		AssertJUnit.assertEquals(true,false);
	}
	
	
	@Test (priority=-2)
	public void testCase2() {
		System.out.println("Test Case 2");
	}


}
