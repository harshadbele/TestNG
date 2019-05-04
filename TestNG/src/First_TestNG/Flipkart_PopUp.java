package First_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart_PopUp {

	WebDriver driver;
	String url="http://flipkart.com";
	@BeforeTest
	public void setup()
	{
	 System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.navigate().to(url);
	 driver.manage().window().maximize();
	}
	
	@Test
	public void popup()
	{
		driver.findElement(By.className("_29YdH8")).click();
		driver.findElement(By.xpath("//div/input[@title='Search for products, brands and more']")).sendKeys("Iphone 6s");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		//Searching item
    	driver.findElement(By.xpath("//div[@class='_1-2Iqu row']/div[1]//div[contains(text(),'Apple iPhone 6s (Gold, 32 GB)')]")).click();
		
	}
}
