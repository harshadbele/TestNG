package First_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windows_Handle {

	WebDriver driver;
	String url="http://Naukri.com";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void window_Handle()
	{
		//For loop method
		/*String parent_Window=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Set<String> s1=driver.getWindowHandles();
		
		
		for(String child_Window:s1)
				{
			driver.switchTo().window(child_Window);
		System.out.println(driver.getTitle());
		}
		*/
		
		//Array Method
		
		/*String parent_window=driver.getWindowHandle();
		
		Set<String> s1=driver.getWindowHandles();
		Object[] id=s1.toArray();
		
		driver.switchTo().window((String)id[0]);
		System.out.println(driver.getTitle());
		driver.switchTo().window((String) id[1]);
	    System.out.println(driver.getTitle());
	*/
		
		//Iterator Method
		
		String mainWindow=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Set<String> s1=driver.getWindowHandles();
		Iterator<String>i1=s1.iterator();
		
		while(i1.hasNext())
		{
			String childWindow=i1.next();
			
			if(!mainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
			}
			
		}
		driver.quit();
	}
}
