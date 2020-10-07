package Sel_assignments;

import java.sql.Driver;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_001 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		WebElement element = driver.findElement(By.id("testingDropdown"));
		SelectElement(driver,element,"Database Testing");
		
		String text = driver.findElement(By.id("database")).getText();    
		
		if (text.equals("Database Testing")) {
			System.out.println("correct text ");
		} else {
			System.out.println("incorrect text");
		}	
	}
	public static void SelectElement(WebDriver driver, WebElement element, String text) {
		Select select = new Select(element);
        select.selectByVisibleText(text);
     
	}
}
