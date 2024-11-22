package My_Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinoda\\Selenium Webdriver\\Gecko Driver\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vinodakn.2024@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Vinu.Niha@2024");
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
			}
			 
		 //Thread.sleep(2000); driver.close();class data-class-idn aria-hidden = 'false'
}
