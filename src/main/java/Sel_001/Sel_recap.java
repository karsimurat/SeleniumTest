package Sel_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_recap {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("session_key"));
		username.sendKeys("sample@sample.com");
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
