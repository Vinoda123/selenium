package My_Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropdown2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinoda\\Selenium Webdriver\\Gecko Driver\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.office.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='resources']")).click();
		
		  List<WebElement> options = driver.findElements(By.xpath("//ul[@style='overflow-x: visible; margin-left: 0px;']"));
		  
		  for (WebElement webElement : options) {
		  
		  String value = webElement.getText(); 
		  System.out.println(value);
		  
		  if(value.equalsIgnoreCase("Customer stories")) {
			  webElement.click();
				break;
		  }

		  }
		 
		
	}

}
