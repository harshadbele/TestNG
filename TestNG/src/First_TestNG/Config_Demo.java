package First_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Config_Demo {

	
	WebDriver driver;
	String url="http://demo.guru99.com/test/guru99home/";
	static FileInputStream fis;
	static Properties prop;
	static String srcfile="C:\\Users\\admin\\workspace\\TestNG\\src\\First_TestNG\\Config_Property.properties";

   @BeforeTest
   public void setup()
     {

	System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to(url);
	driver.manage().window().maximize();
     }

@Test
public void config()
{
 
	File floc=new File(srcfile);
	
	try
	{
		fis=new FileInputStream(srcfile);
		prop=new Properties();
		
		prop.load(fis);
		
		driver.findElement(By.xpath(prop.getProperty("mobile_texting"))).click();
		
		driver.navigate().back();
		
		driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys("gadkkad");
		
		driver.findElement(By.id(prop.getProperty("signup"))).click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	catch(FileNotFoundException e)
	{
	System.out.println("File not found");	
	}
 
	catch(IOException e)
	{
		System.out.println("File I/O corrupt");
	}
}
}