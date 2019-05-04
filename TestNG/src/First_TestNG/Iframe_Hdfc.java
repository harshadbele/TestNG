package First_TestNG;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Flash.FlashObjectWebDriver;

public class Iframe_Hdfc {

	WebDriver driver;
	String url="https://www.hdfcbank.com/";


	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver","c://chromdriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		//driver.findElement(By.className("mainlink")).click();
	}


	@Test
	public void hdfc_iframe() 
	{
		//FlashObjectWebDriver flash=new FlashObjectWebDriver(driver, flashObjectId)
		List<WebElement> element=driver.findElements(By.tagName("iframe"));
		element.size();

		System.out.println("size:"+element.size());

		driver.switchTo().frame("viz_ifrm36255c7783d95d1341d68bbc6e0ONR");
		
  
		//driver.findElement(By.xpath("//*[conatins(text(),'Apply Now)']")).click(); 
	}

}
