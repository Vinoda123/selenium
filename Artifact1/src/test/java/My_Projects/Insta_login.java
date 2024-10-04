package My_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta_login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinoda\\Selenium Webdriver\\Gecko Driver\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("14vinodakn");
		driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("VinodaKN#14");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}

}
