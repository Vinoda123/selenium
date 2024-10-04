package My_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinoda\\Selenium Webdriver\\Gecko Driver\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		// WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.amezon.com");
		driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(1000);
	}

}
