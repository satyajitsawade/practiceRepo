package includeExclude;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncludeExclude {
	static WebDriver driver;
	
// generate xml file for class package project as you need
//	then in xml you can include in methods <include name="checkTopIcon_Mobiles"></include>
//	for exclude you can use exclude keyword <exclude name="verifyUrlOfPage"></exclude>
//	
//	<class name="includeExclude.IncludeExclude">
//	<methods>
//	<exclude name="verifyUrlOfPage"></exclude>
//	<exclude name="verifyPageTitle"></exclude>
//	<include name="checkTopIcon_Mobiles"></include>
//	</methods>
//
//  </class>
	

	@BeforeTest
	public void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}


	@Test(priority=1)
	public void verifyUrlOfPage() {
		String url = driver.getCurrentUrl();
//		Assert.assertEquals(url, "https://www.fkart.com/", "Verify url of page"); // Hard Assert fail
		AssertJUnit.assertEquals(url , "https://www.flipkart.com/", "Verify url of page");  // Hard Assert Pass
		System.out.println("Next line of Hard Assert.");
	}

	@Test(priority=2)
	public void verifyPageTitle() {
		String title = driver.getTitle();
		AssertJUnit.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println(title);
	}
	
	@Test (priority=3)
	public void checkTopIcon_TopOffers() {
		boolean b = driver.findElement(By.xpath("//div[text()='Top Offers']")).isDisplayed();
		AssertJUnit.assertEquals(b, true);
		System.out.println(b);
	}
	
	@Test (priority=4)
	public void checkTopIcon_Mobiles() {
		boolean b = driver.findElement(By.xpath("//div[text()='Mobiles']")).isDisplayed();
		AssertJUnit.assertEquals(b, true);
	}
	
	@Test (priority=5)
	public void checkTopIcon_Electronics() {
		String s = driver.findElement(By.xpath("//div[text()='Electronics']")).getText();
		AssertJUnit.assertEquals(s, "Electronics","Check Text in Electrionics");
	}
	
	
	
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
