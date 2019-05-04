package First_TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoIT {
    WebDriver driver;
    String url="http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html";
	@BeforeTest
	public void setup()
	{
        System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
        driver= new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
	}
	
	@Test
	public void file_Upload() throws IOException
	{
		driver.findElement(By.id("uploadfile")).click();	
		Runtime.getRuntime().exec("P:\\FileUpload1.exe");
	}
}
