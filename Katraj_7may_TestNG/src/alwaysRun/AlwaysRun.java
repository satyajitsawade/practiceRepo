package alwaysRun;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
	//When we use alwaysRun=true it means the test case will execute even if it’s dependsOnMethod get fail
	//When we use enabled=true it means the test case will skip if it’s dependsOnMethod get fail
	
	@Test (priority=1, dependsOnMethods="testCase3",alwaysRun=true)
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
