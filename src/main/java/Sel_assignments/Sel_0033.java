package Sel_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_0033 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement element = driver.findElement(By.id("testingDropdown"));
		
		Select select = new Select(element);
		
		System.out.println(select.isMultiple());
		
		
		System.out.println("Test completed");
		
		driver.quit();
	}

}
