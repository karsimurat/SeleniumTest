package Sel_GitHub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_032_ImplicitlyWait {

	public static void main(String[] args) {

		//This wait tells webdriver to wait if the element is not available immidiatelly
				//and webdriver waits till the element is visible in specific time
				//NoSuchElementException
				//Imp wwait can be used only webelement
		// non element =  , if you can not get locator. its non element
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://app.hubspot.com/login");
				
				//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 6);
				wait.until(ExpectedConditions.titleContains("HubSpot"));
				
				
				
				System.out.println("title is :"+ driver.getTitle());

			}
	}


