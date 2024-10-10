package My_Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinoda\\Selenium Webdriver\\Gecko Driver\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@id='bootstrapmenu']")).click();
		List<WebElement> options =  driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		
		for (WebElement webElement : options) {
			
			String value = webElement.getText();
			System.out.println(value);
			 
			if(value.equalsIgnoreCase("contact us")) {
				webElement.click();
				break;
			}
			 
		}
		
		 //Thread.sleep(2000); driver.close();class data-class-idn aria-hidden = 'false'
	}

}
