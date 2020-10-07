package Sel_assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week4_002 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
				
		By jsAlert = By.xpath("//button[contains(text(),'Click for JS Alert')]");
		By alert2 = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
		By alert3 = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
		
		alerthandling(driver, jsAlert);
		alerthandling(driver, alert2);
		alerthandling(driver, alert3);
		
		System.out.println("test completed");
		
	}
	
	public static void alerthandling (WebDriver driver, By locator ) throws InterruptedException {
	
	driver.findElement(locator).click();
	Thread.sleep(2000);
	Alert alert  = driver.switchTo().alert();
	Thread.sleep(1000);
	alert.accept();
	
	
	

}
}