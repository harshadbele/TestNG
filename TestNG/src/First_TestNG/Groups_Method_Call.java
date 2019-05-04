package First_TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups_Method_Call {

	WebDriver driver;
	String url="http://Facebook.com";
	String expected=null;
	String actual=null;
 @BeforeTest
 public void setup()
 {
	 System.setProperty("WebDriver.chrome.driver","C://chromedriver.exe");
	 driver=new ChromeDriver();
	
	 driver.manage().window().maximize();
	 driver.navigate().to(url);
	}

 @BeforeMethod
 public void homepage()
 {
	 driver.findElement(By.linkText("Facebook")).click();
	 
	 expected="Facebook – log in or sign up";
	 Assert.assertEquals(driver.getTitle(), expected);
 }
 
 @Test(priority=0,groups="drop")
 public void login_id()
 {
	 driver.findElement(By.id("email")).sendKeys("jkad");
	 driver.findElement(By.id("pass")).sendKeys("kgad");
	 driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	 //driver.findElement(By.linkText("Facebook")).click();
	 
	 actual=driver.getTitle();
	 expected="Log in to Facebook | Facebook";
	 Assert.assertEquals(actual, expected);
 }
 
 @Test(priority=1,groups="drop")
 public void dropdown()
 {
	 Select day=new Select(driver.findElement(By.id("day")));
	 day.selectByIndex(25);
	 Select month=new Select(driver.findElement(By.id("month")));
	 month.selectByVisibleText("Dec");
	 Select year=new Select(driver.findElement(By.xpath("//*[@id='year']")));
	 year.selectByValue("1988");
	 
 }
 
 @Test(priority=2,groups="imp")
 public void gender()
 {
	WebElement male=driver.findElement(By.id("u_0_a"));
	
			male.click();
	    
	 actual="Male";
	 expected="Male";
	 Assert.assertEquals(actual, expected);
	 
 }
 
}
