package Sel_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Week4_006 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.designmantic.com/");
		
		String title = driver.getTitle();
		//System.out.println(title);
		if (title.equals("Graphic Design Software & Logo Tool | DesignMantic: The Design Shop")) {
			System.out.println("correct page");
		} else {
			System.out.println("incorrect page");
		}
		driver.findElement(By.xpath("//li[@class='login-link']//span[contains(text(),'Login')]")).click();
		driver.findElement(By.id("username")).sendKeys("sample@sample.com");
		driver.findElement(By.id("password")).sendKeys("sample123");
		
		driver.findElement(By.xpath("//input[@class='btn btn-md btn-color-1 btn-radius']")).click();
		
		String text  = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		System.out.println(text);
		
		if (text.equals("Bad credentials.")) {
			System.out.println("correct text");
		} else {
			System.out.println("incorrect text");
		}
		
		driver.quit();
		System.out.println("test completed");
		
	}

}
