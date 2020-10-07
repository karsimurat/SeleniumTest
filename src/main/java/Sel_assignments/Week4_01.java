package Sel_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Week4_01 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		Thread.sleep(3000);
		String text  = element.getText();
		System.out.println(text);
		driver.quit();
		
		if (text.equals("Hello World!")) {
			System.out.println("correct text");
		} else {
			System.out.println("incorrect text");
		}
	}

}
