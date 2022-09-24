package assertions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
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

public class HardAssert {
	static WebDriver driver;

	@BeforeTest
	public void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	// If Hard Assert get fail then the next line of that test will not executed
	// If Hard Assert Pass then next line will be executed.

	@Test(priority=1)
	public void verifyUrlOfPage() {
		String url = driver.getCurrentUrl();
		AssertJUnit.assertEquals(url, "https://www.fkart.com/", "Verify url of page"); // Hard Assert fail
//		Assert.assertEquals(url , "https://www.flipkart.com/", "Verify url of page");  // Hard Assert Pass
		System.out.println("Next line of Hard Assert.");
	}

	@Test(priority=2)
	public void verifyPageTitle() {
		String title = driver.getTitle();
		AssertJUnit.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println(title);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
