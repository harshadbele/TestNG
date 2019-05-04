package First_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

public class Scroll_Down {

	WebDriver driver;
	String url="http://snapdeal.com";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;

       	//	jse.executeScript("window.scrollBy(0,1000)");
       		
		WebElement element=driver.findElement(By.xpath("//div[@class='middle-heading subscribeHead']"));
		
		jse.executeScript("arguments[0].scrollIntoView();",element);
	}
	}

