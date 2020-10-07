package Sel_DersNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_45 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.verizonwireless.com/");
		By shopBtn=By.xpath("//button[@id='gnav20-Shop-L1']");
		By smartPhones=By.id("gnav20-Shop-L3-1");
		
		
		WebElement shop=driver.findElement(shopBtn);
		Actions actions=new Actions(driver);
		actions.moveToElement(shop);
		
		WebElement smart=driver.findElement(smartPhones);
		actions.click(smart).build().perform();
		Thread.sleep(4000);
		
	}

}
