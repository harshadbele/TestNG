package First_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Config_Facebook {

	WebDriver driver;
    String url="http://Facebook.com";
    
    static FileInputStream fis;
    static FileOutputStream fos;
    static Properties prop;
    static String src="C:\\Users\\admin\\workspace\\TestNG\\src\\First_TestNG\\facebook.properties";
    
    @BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to(url);
	    driver.manage().window().maximize();
	}
    
    @Test
    public void facebook_login()
    {
    	File floc=new File(src);
    	
    try{
    	fis=new FileInputStream(src);
    	prop=new Properties();
    	
    	prop.load(fis);
    	
    	driver.findElement(By.id(prop.getProperty("fname"))).sendKeys("Harshad");
    	driver.findElement(By.id(prop.getProperty("lname"))).sendKeys("Bele");
    	driver.findElement(By.xpath(prop.getProperty("mobile"))).sendKeys("hbaa@gank");
        driver.findElement(By.name(prop.getProperty("regpass"))).sendKeys("pasad");
    	driver.findElement(By.xpath(prop.getProperty("submit"))).click();

    }
    catch(FileNotFoundException e)
    {
    System.out.println("File not found");	
    }
    catch(IOException e)
    {
    	System.out.println("IO exception");
    }
    }
    
}
