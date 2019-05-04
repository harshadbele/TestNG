package First_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Multiple_Suit_Flipkart {

	WebDriver driver;
	String url="https://www.snapdeal.com";
	
	
	String username=null;
	String password=null;
	
	@BeforeClass
	public void setup()
	{
	System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to(url);
	driver.manage().window().maximize();
	}
	
	
	@Test
	public void search_product()
	{
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		search.sendKeys("Apple iphone 6s");
		
		//driver.findElement(By.xpath("//*[@class='searchTextSpan']")).click();
	
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[2]/div[1]/div[2]/button[1]/span[1]")).click();
		
		
		String css = ".gd-row.browse-grid-row:nth-of-type(1) > div:nth-child(1)>div>div:nth-child(2)>div>a";
		driver.findElement(By.cssSelector(css)).click();

	}
	
	
}
