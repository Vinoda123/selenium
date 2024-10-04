package My_Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.RemoteWebElement;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinoda\\Selenium Webdriver\\Gecko Driver\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		// WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Vinoda/Desktop/seleniumHTML/MultipleDropdown.html");
		driver.manage().window().maximize();

		WebElement drop = driver.findElement(By.id("Random Name"));
		Select sel = new Select(drop);
		if (sel.isMultiple()) {
			sel.selectByIndex(1);
			Thread.sleep(1000);
			
			sel.selectByValue("3");
			Thread.sleep(1000);
			
			sel.selectByVisibleText("RCB1");
			Thread.sleep(1000);
			
			List<WebElement> option = sel.getOptions();
			int count = option.size();
			System.out.println("dropdown size is : " + count);
			
			String text = null;
			for(WebElement options : option) {
				 text = options.getText();
				 System.out.println("DropDown Option : " + text);
			}
			System.out.println("DropDown Option : " + text);
			
			
			
			System.out.println("i am multiple");
		} else {
			System.out.println("i am single");
			
		}

	}

}
