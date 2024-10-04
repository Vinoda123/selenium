package My_Projects;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProject {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Vinoda\\Selenium Webdriver\\Gecko Driver\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		// WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amezon.in");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("Page Title : " + title);

		String URL = driver.getCurrentUrl();
		System.out.println("Page URL : " + URL);

		String Source = driver.getPageSource();
		System.out.print("Source Code : ");
		System.out.println(Source);

		driver.navigate().to("http://www.meesho.com");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div/div[1]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div/div[4]/div/div[1]/a[2]/p")).click();
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='sc-dkrFOg ProductList__GridCol-sc-8lnc8o-0 cokuZA eCJiSA']"));
		System.out.println(webelements);
		
		

	}

}
