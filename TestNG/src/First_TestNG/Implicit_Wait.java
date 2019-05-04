package First_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Implicit_Wait {

	WebDriver driver;
	
	String url="http://gmail.com";
	String act="Gmail";
	String exp_url="";
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
	    
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void implicit_wait()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		exp_url=driver.getTitle();
		
	 Assert.assertEquals(act, exp_url);
	 
	}
}
