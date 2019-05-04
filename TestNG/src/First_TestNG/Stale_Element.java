package First_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_Element
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("java");

		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li"));

		System.out.println("Number of search result="+list.size());


		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			try
			{
				if(list.get(i).getText().contains("java tutorial"))
				{
					System.out.println("Clicked On= "+list.get(i).getText());
					list.get(i).click();
					break;
				}
			}
			catch(StaleElementReferenceException e)
			{
				System.out.println("Stale Element Exception has been caught");
			}
		}

	}
}
