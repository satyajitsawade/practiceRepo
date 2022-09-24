package runOnlyFailedTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunFailTest {
	static WebDriver driver;

	@BeforeTest
	public void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	//  first run test execution
	//  refresh project
	//	test OuptPut> testng-failed.xml> open> run
	// this file contains all the test cases failed in last execution

	@Test(priority=1,groups="smoke")
	public void verifyUrlOfPage() {
		String url = driver.getCurrentUrl();
//		Assert.assertEquals(url, "https://www.fkart.com/", "Verify url of page"); 
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(url , "https://www.flipkart.com/", "Verify url of page");  // soft Assert fail
		System.out.println("Next line of Hard Assert.");
		softassert.assertAll();
	}

	@Test(priority=2, groups="smoke")
	public void verifyPageTitle() {
		String title = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println(title);
		softassert.assertAll();
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
