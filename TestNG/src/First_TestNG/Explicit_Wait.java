package First_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Explicit_Wait {
   
	WebDriver driver;
	String url="http://gmail.com";
    static WebDriverWait wait;	
    static WebElement forgotpass;
	@BeforeTest
	public void setup()
	{	
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.id("identifierId")).sendKeys("beleharshad@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	
		
		By pass=By.xpath("//*[@name='password']");
		 
		forgotpass=driver.findElement(By.xpath("//span[contains(text(),'Forgot password?')]"));
		Sendkeys(driver,pass,4);
		
		System.out.println("link test"+forgotpass.getText());
		
		click(driver,forgotpass,3);
	}
	
	
	public  static void Sendkeys(WebDriver driver,By forgotpass,int timeout)
	{
		wait=new WebDriverWait(driver,timeout);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(forgotpass));
		
		driver.findElement(forgotpass).sendKeys("Iamfeeling");
	}
	
	
	public static void click(WebDriver driver,WebElement forgo,int timeout)
	{
	wait=new WebDriverWait(driver, timeout);

	wait.until(ExpectedConditions.visibilityOf(forgo));
	forgo.click();

	}
	
}
