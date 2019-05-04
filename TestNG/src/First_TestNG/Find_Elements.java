package First_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Find_Elements {

	WebDriver driver;
	String url="http://naukri.com";
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
	    driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void find_Elements()
	{
		List<WebElement> list=driver.findElements(By.tagName("input"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
	System.out.println(list.get(i).getTagName());		
		}
	}
}
