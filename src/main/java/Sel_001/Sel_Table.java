package Sel_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Table {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 
		 String beforexpath = "//*[@id=\"customers\"]/tbody/tr[";
		 String afterxpath = "]/td[1]";
		 
		 for (int i = 2; i <=7 ; i++) {
			String actualxpath = beforexpath + i + afterxpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			if(element.getText().equals("Island Trading")) {
		    	System.out.println("company name :"+ element.getText()+ " is found"+ "at position "+ (i-1));
		    	break;
		    }
		}	 	
	}
}
