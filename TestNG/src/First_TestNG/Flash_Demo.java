package First_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Flash.FlashObjectWebDriver;

public class Flash_Demo {

	WebDriver driver;
	String url="https://www.hdfcbank.com/";
	@BeforeTest
	public void setup()
	{
	// System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.navigate().to(url);
	 driver.manage().window().maximize();
	}
	
	@Test
	public void flash_Testing()
	{
		
		//driver.findElement(By.name("myFlashMovie")).click();
		FlashObjectWebDriver flashapp=new FlashObjectWebDriver(driver, "myFlashMovie");
	    driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		flashapp.callFlashObject("Play");
		flashapp.callFlashObject("StopPlay");
		flashapp.callFlashObject("SetVarible","/:message","Flash testing");
		System.out.println(flashapp.callFlashObject("GetVariable","/:message"));
		
		
		
		
		
	}
}
