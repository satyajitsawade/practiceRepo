package listenerCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(utility.Listernersss.class)
public class CheckListener {
	WebDriver driver;
	@BeforeTest (groups="launch browser")
	public void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
//  we write Listener class in utility package and implements to the ITestListener
//	then to use it at class level we use @Listeners(utility.Listernersss.class)
//	

	@Test(priority=1,groups="smoke")
	public void verifyUrlOfPage() {
		String url = driver.getCurrentUrl();
//		Assert.assertEquals(url, "https://www.fkart.com/", "Verify url of page"); // Hard Assert fail
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(url , "https://www.pkart.com/", "Verify url of page");  // Hard Assert Pass
		System.out.println("Next line of Hard Assert.");
		obj.assertAll();
	}

	@Test(priority=2, groups="smoke")
	public void verifyPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(title,
				"Online Shopping  for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
		obj.assertAll();
	}
	
	@Test (priority=3, groups="smoke")
	public void checkTopIcon_TopOffers() {
		boolean b = driver.findElement(By.xpath("//div[text()='Top Offers']")).isDisplayed();
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(b, true);
		System.out.println(b);
		obj.assertAll();
	}
	
	@Test (priority=4, groups="regression")
	public void checkTopIcon_Mobiles() {
		boolean b = driver.findElement(By.xpath("//div[text()='Mobiles']")).isDisplayed();
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(b, true);
		obj.assertAll();
	}
	
	@Test (priority=5, groups="regression")
	public void checkTopIcon_Electronics() {
		String s = driver.findElement(By.xpath("//div[text()='Electronics']")).getText();
		System.out.println(s);
	}
	
	@AfterTest (groups="teardown")
	public void tearDown() {
		driver.quit();
	}






}
