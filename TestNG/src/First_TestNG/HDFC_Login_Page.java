package First_TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HDFC_Login_Page {
   WebDriver driver;
   String expected=null;
   String actual=null;
   String url="https://www.hdfcbank.com/";
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void homepage_validation()
	{
		String expected_title="HDFC Bank: Personal Banking Services";
		String actual_title=driver.getTitle();
	    Assert.assertEquals(actual_title, expected_title);
	}
	
	@Test(priority=3)
	public void mouse_over() throws InterruptedException
	{
		Thread.sleep(3000);
		expected="Digital Application Platform";
		
		WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Apply now')]"));
		WebElement car_loan=driver.findElement(By.linkText("Car Loan"));
		
		Actions buffer=new Actions(driver);
		
		Action series_action=buffer.moveToElement(element)
				             .moveToElement(car_loan)
				             .click()
				             .build();
		series_action.perform();
		actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(priority=2)
	public void login() 
	{
		
		expected="loan";
		WebElement search=driver.findElement(By.xpath("//*[@placeholder='Search']"));
		            search.sendKeys("loan");
		            search.click();
		            
         Assert.assertEquals(actual, expected);		
	}

/*	@Test(priority=1)
	public void popup() 
	{
		driver.findElement(By.className("div-close-icon-4")).click();
	}
*/
		
	@AfterMethod
	public void homepage() throws InterruptedException 
	{
		driver.findElement(By.xpath("//img[@src='/assets/images/home-iconNew.jpg']")).click();
		driver.switchTo().frame(0);
		
	
	}
	
	
}
