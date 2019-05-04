package First_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Execution_Session {

	//Calling system.setproperty again again 
	//browser calling three times
	
	
	WebDriver driver;
	String url="http://facebook.com";
	
	@Test
	public void setup_1() throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
	 WebElement email=driver.findElement(By.id("email"));
	 email.sendKeys("Harshad");
	
	
	}
	
	@Test
	public void setup_2() throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		 WebElement email=driver.findElement(By.id("email"));
				 email.sendKeys("Parag");
		       
		       
	}
	
	@Test
	public void setup_3() throws InterruptedException
	{
        System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Sandeep");
		
	}
	
}
