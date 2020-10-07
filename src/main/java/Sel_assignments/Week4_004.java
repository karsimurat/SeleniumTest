package Sel_assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Week4_004 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys("haci");
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		
		if (text.equals("Hello haci, share this practice page and share your knowledge")) {
			System.out.println("corret text");
		} else {
			System.out.println("incorrect text");
		}
		
		driver.quit();
		System.out.println("test completed");
			
	}

}
