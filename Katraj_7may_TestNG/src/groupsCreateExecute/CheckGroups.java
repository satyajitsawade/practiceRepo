package groupsCreateExecute;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckGroups {
	WebDriver driver;
	@BeforeTest (groups="launch browser")
	public void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
// use xml to control execution
//	In test add groups in groups add run
//	In run we can write include/exclude
	/*
	 * <test thread-count="5" name="Test">
  <groups>
  <run>
  <include name="sanity"> </include>
  </run>
  </groups>
    <classes>
      <class name="groupsCreateExecute.CheckGroups"/>
    </classes>
  </test> <!-- Test -->
	 */

	@Test(priority=1,groups={"smoke","regression"})
	public void verifyUrlOfPage() {
		String url = driver.getCurrentUrl();
//		Assert.assertEquals(url, "https://www.fkart.com/", "Verify url of page"); // Hard Assert fail
		Assert.assertEquals(url , "https://www.flipkart.com/", "Verify url of page");  // Hard Assert Pass
		System.out.println("Next line of Hard Assert.");
	}

	@Test(priority=2, groups={"smoke","functional"})
	public void verifyPageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println(title);
	}
	
	@Test (priority=3, groups={"smoke","sanity"})
	public void checkTopIcon_TopOffers() {
		boolean b = driver.findElement(By.xpath("//div[text()='Top Offers']")).isDisplayed();
		Assert.assertEquals(b, true);
		System.out.println(b);
	}
	
	@Test (priority=4, groups={"regression","functional"})
	public void checkTopIcon_Mobiles() {
		boolean b = driver.findElement(By.xpath("//div[text()='Mobiles']")).isDisplayed();
		Assert.assertEquals(b, true);
	}
	
	@Test (priority=5, groups={"regression","sanity"})
	public void checkTopIcon_Electronics() {
		String s = driver.findElement(By.xpath("//div[text()='Electronics']")).getText();
		Assert.assertEquals(s, "Electronics","Check Text in Electrionics");
	}
	
	
	
	
	
	
	@AfterTest (groups="teardown")
	public void tearDown() {
		driver.quit();
	}


}
