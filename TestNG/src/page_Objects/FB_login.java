package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FB_login {

	static WebDriver driver;
    static WebElement element;
	public static WebElement fb_login(WebDriver driver)
	{
		element=driver.findElement(By.id("email"));
		
		return element;
	}
	
	
}
