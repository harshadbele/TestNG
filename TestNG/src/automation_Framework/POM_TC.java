package automation_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page_Objects.FB_login;

public class POM_TC {
     public static WebDriver driver=null;
	public static void main(String[] args) {
       
		driver=new ChromeDriver();
		
		driver.navigate().to("http://facebook.com");
		
		driver.manage().window().maximize();
		
		FB_login.fb_login(driver).sendKeys("Harshad");
		
	
		
	}
}
