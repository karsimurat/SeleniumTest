package Sel_DersNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_testNG {

	public static WebDriver driver;
	//Locators
	By email = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("loginBtn");
	@BeforeMethod
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
	}
	@Test
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test
	public void invalidCredentialsForLogin(){
		ElementUtil.getElement(driver,email).sendKeys("ilhan@sample.com");
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
