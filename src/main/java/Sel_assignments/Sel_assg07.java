package Sel_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_assg07 {

	public static void main(String[] args) throws InterruptedException {
		//	Assignment 7

				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.designmantic.com/");
				
				WebElement element = driver.findElement(By.id("selectservice"));
				Thread.sleep(2000);
				Select select = new Select(element);
				
				select.selectByIndex(2);
				
				driver.findElement(By.id("company_name")).sendKeys("murat LLc");
				WebElement element2 = driver.findElement(By.id("details_categories"));
				Select select2 = new Select(element2);
				
				select2.selectByIndex(7);
				
				driver.findElement(By.xpath("//span[contains(text(),‘Show My Designs Free ’)]")).click(); // own creation of xpath using by contains method..
				
				System.out.println("Assignmenet 07 is completed");
			}

	}


