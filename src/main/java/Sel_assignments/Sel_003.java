package Sel_assignments;
import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_003 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		WebElement element = driver.findElement(By.id("testingDropdown"));
		
			listA(element);
	}
	public static void listA( WebElement element) {
		
		Select select = new Select(element);
		java.util.List<WebElement> elements = select.getOptions();
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}
	}
}
