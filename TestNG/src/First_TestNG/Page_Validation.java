package First_TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Page_Validation {

	WebDriver driver;
	String url="http://demo.guru99.com/test/newtours/";
public 	String expected_title=null;
public	String actual_title=null;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver", "C://chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to(url);
	}
	
	@BeforeMethod
	public void homepage()
	{
         String expected="Welcome: Mercury Tours";
	     String actual=driver.getTitle();
    	 Assert.assertEquals(actual,expected);    
	}
	
	@Test(priority=1)
	public void register()
	{
   		driver.findElement(By.linkText("REGISTER")).click();
		 expected_title="Register: Mercury Tours";
		 actual_title=driver.getTitle();
		 Assert.assertEquals(actual_title,expected_title);
	}
	
	@Test(priority=1,description="Support Block")
	public void support()
	{
		driver.findElement(By.linkText("SUPPORT")).click();
		expected_title="Under Construction: Mercury Tours";
		actual_title=driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
	}
	
	
	@AfterMethod
	public void after_method()
	{
		driver.findElement(By.linkText("Home")).click();
        System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void  after_test()
	{
		driver.close();
	}
	
}
