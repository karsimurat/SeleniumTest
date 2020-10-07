package Sel_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_006ass {

	public static void main(String[] args) throws InterruptedException {

		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.verizon.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("gnav20-Shop-L1")).click(); 
			Thread.sleep(3000);
			driver.findElement(By.id("gnav20-Shop-L3-1")).click(); 
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='tile_dev13720073']//img[@class='positionAbsolute bottom0 top0 left0 right0 noHoverImage swiper-lazy swiper-lazy-loaded']")).click();
			Thread.sleep(3000);
			WebElement devicename = driver.findElement(By.xpath("//h1[@class='fontDSStd-75Bd fontSize_24 textAlignLeft color_000 deviceName']//span[contains(text(),'Samsung Galaxy Note20 Ultra 5G')]"));
			
			String text = devicename.getText();
			System.out.println(text);
			if (text.equals("Samsung Galaxy Note20 Ultra 5G")) {
				System.out.println("Correct item");
			} else {
				System.out.println("False item");
			}
	}

}
