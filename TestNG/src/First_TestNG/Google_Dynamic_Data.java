package First_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google_Dynamic_Data {

	WebDriver driver;
	String url="https://www.snapdeal.com/";
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
	
	driver.manage().window().maximize();
	}
	
	
	@Test
	public void test() throws InterruptedException
	{
	   driver.findElement(By.xpath("//*[@id='inputValEnter']")).sendKeys("puma");
	   Thread.sleep(3000);
	   List<WebElement> list=driver.findElements(By.xpath("//*[@id='sdHeader']/div[4]/div[2]/div/div[2]/div[4]/div/div/ul[2]/li"));
	   
	   
	   System.out.println("Total number of suggestions in a search boxes are::===>"+list.size());
	 //  System.out.println(list);
	   
	   
	   for(int i=0;i<list.size();i++)
	   {
		   System.out.println(list.get(i).getText());
		try{
		   if(list.get(i).getText().contains("Puma Slipper"));
		   {
			   list.get(i).click();
			   break;
		   }
		}
		catch(StaleElementReferenceException e)
		{
			System.out.println("Stale Element exception caught");
		}
	   }
	   

		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Puma Caper IDP Brown Daily Slippers']")).click();
	   
	}
	
	@AfterTest
	public void teardown()
	{
		//driver.close();
	}
}
