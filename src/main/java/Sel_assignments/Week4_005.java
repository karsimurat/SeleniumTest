package Sel_assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week4_005 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys("haci murat");
		driver.findElement(By.id("confirmbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		
		if (text.equals("Hello haci murat, Are you sure you want to confirm?")) {
			System.out.println("corret text");
		} else {
			System.out.println("incorrect text");
		}
		
		driver.quit();
		System.out.println("test completed");
		
	}

}
