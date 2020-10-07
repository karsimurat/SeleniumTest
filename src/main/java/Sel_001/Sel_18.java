package Sel_001;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_18 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		ChromeOptions  chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(false);
		driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(day);
		select.selectByIndex(9);
		
		Select selectmonth = new Select(month);
		selectmonth.selectByVisibleText("Apr");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
