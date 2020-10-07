package Sel_assignments;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_005 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();
		
		AlertHandle(driver);
		System.out.println("Test completed");
		
		driver.quit();
	}
	public static void AlertHandle(WebDriver driver) throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(1000);
		driver.quit();
	}
	}


