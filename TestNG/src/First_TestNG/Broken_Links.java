package First_TestNG;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Broken_Links {

	String parent_url="http://www.zlti.com";
	String url=null;
	HttpURLConnection huc=null;
	WebDriver driver;
	int response_code=200;
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(parent_url);
	}
	
	@Test
	public void broken_links()
	{
	List<WebElement> list=driver.findElements(By.tagName("a"));
	
	Iterator<WebElement>i1=list.iterator();
	
	while(i1.hasNext())
	{
		url=i1.next().getAttribute("href");
		
		if(url==null)
		{
			System.out.println("Domain name is null: "+url);
			continue;
		}
		
		if(!url.startsWith(parent_url))
		{
			System.out.println("Domain name is wrong: "+url);		
		continue;
		}
		
		
		try
		{
		huc=(HttpURLConnection)(new URL(url)).openConnection();
		
		huc.setRequestMethod("HEAD");
		huc.connect();
		response_code=huc.getResponseCode();
		if(response_code>=400)
		{
			System.out.println("Broken_links: "+response_code);
		}
		else
		{
			System.out.println("Links are good"+response_code);
		}
		
		}
		catch(MalformedURLException e)
		{
			e.getStackTrace();
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
		
	}
	}
}
