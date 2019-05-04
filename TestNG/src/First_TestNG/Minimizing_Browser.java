package First_TestNG;

import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Minimizing_Browser {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	/*@Test
	public void minimizing()
	{
		//Minimizing Window
		Point p=new Point(0,3000);
		
		driver.manage().window().setPosition(p);
		
		
		//Window Resizing 
		
		Dimension d=new Dimension(0,1080);
		
		driver.manage().window().setSize(d);
		
		
	}
	*/
	
	@Test(priority=1,invocationCount=2)
	public void m1()
	{
		System.out.println("priority=1");
	}
	
	@Test(priority=2,groups={"m2"})
	public void m2()
	{
		System.out.println("priority=2");
	}
	
	@Test(priority=3,groups={"m2"})
	public void m3()
	{
		System.out.println("priority=3");
	}
	@Test(priority=4,groups={"m2"})
	public void m4()
	{
		System.out.println("priority=4");
	}
	
}
