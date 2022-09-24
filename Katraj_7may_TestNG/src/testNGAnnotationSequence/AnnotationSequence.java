package testNGAnnotationSequence;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSequence {
	@BeforeSuite  //1
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest //2
	public void beforeTese() {
		System.out.println("Before Test");
	}
	
	@BeforeClass  //3
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod   //4
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test ()   //5
	public void testCase() {
		System.out.println("Test Case ");
		AssertJUnit.assertEquals(true,true);
	}
	
	@AfterMethod  //6
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass //7
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest  //8
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@AfterSuite  //9
	public void afterSuite() {
		System.out.println("After Suite");
	}
	

}
