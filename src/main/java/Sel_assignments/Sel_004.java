package Sel_assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_004 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
		
		alertHandling(driver);
		
		System.out.println("Test completed");
		
		driver.quit();
	}
	public static void alertHandling(WebDriver driver){
		
		Alert alert = driver.switchTo().alert();
		alert.accept();	
	}
	}


