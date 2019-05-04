package First_TestNG;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
    WebDriver driver;
    String url="http://facebook.com";
	
    @BeforeMethod
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
	}
    
    
    @Test(dataProvider="SearchProvider")
    public void facebook_login(String username,String password)
    {
    	driver.findElement(By.id("email")).sendKeys(username);
    	driver.findElement(By.id("pass")).sendKeys(password);
    }
    
    @DataProvider(name="SearchProvider")
    public static  Object[][] getdatafromSearchProvider(Method m)
    {
    	if(m.getName().equalsIgnoreCase("facebook_login"))
    	{
    	return new Object[][]
    	{
    	   {"Harshad","harshad"},
    	   {"Parag","Bele"},
    	   {"Bele","bele"}
   		};
    	}
		return null;
    }
}
