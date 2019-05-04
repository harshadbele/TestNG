package First_TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class log4j {


	WebDriver driver;
	String url="http://Facebook.com";
	Logger log=Logger.getLogger("log4j");
	public void takescreenshot(WebDriver driver,String screenshot)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(srcfile,new File("C:\\Users\\admin\\workspace\\TestNG\\src\\screenshot"+screenshot+".png"));
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
	}
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		
		driver=new ChromeDriver();
 		driver.navigate().to(url);
		driver.manage().window().maximize();
		PropertyConfigurator.configure("log4j.properties");
	
	}
	
	
	@Test
	public void facebook_login() throws InterruptedException
	{
		takescreenshot(driver, "screenshot_1");
		log.info("taking first screenshot");
		driver.findElement(By.id("email")).sendKeys("sfasa");
		log.info("sending email id");

		driver.findElement(By.id("pass")).sendKeys("jhasd");
		log.info("sending password");
		Thread.sleep(2000);
		log.info("thread sleep");
		takescreenshot(driver, "screenshot_2");
		log.info("taking second screenshot");
	}
}
