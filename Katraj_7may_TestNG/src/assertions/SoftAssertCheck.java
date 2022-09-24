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
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertCheck {
	WebDriver driver;

	@BeforeTest
	public void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	// If Soft Assert get fail then the next line of that test will be executed and
	// will fail
	// If Soft Assert Pass then next line will be executed.

	@Test(priority = 1)
	public void verifyUrlOfPage() {
		String url = driver.getCurrentUrl();
		SoftAssert softAssert = new SoftAssert();
		AssertJUnit.assertEquals(url, "https://www.fkart.com/", "Check url of page");
		System.out.println("Next line of soft asset");
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public void verifyPageTitle() {
		String title = driver.getTitle();
		SoftAssert softAssert = new SoftAssert();
		AssertJUnit.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",
				"check page title");
		System.out.println(title);
		softAssert.assertAll();
	}

	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
