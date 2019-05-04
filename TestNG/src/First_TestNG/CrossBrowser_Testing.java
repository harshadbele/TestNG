package First_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Testing {

	WebDriver driver;
	String url="http://demo.guru99.com/V4/";
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		}
		
		else if (browser.equalsIgnoreCase("Firefox"))			
		{			
			driver=new FirefoxDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize();
			
		}
	
	}
	
	@Test
	public void test()
	{
		driver.navigate().to(url);
		driver.findElement(By.name("uid")).sendKeys("Harshad");
		driver.findElement(By.name("password")).sendKeys("gakjd");
		driver.findElement(By.name("btnLogin")).click();
	}
	
}
