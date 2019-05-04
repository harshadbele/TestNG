package First_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POM {
	
	WebDriver driver;
	
	public POM(WebDriver driver)
	{
		this.driver=driver;
	}
@FindBy (id="email")
WebElement email_textbox ;


	public void set_email_id(String usernm)
	{
		email_textbox.sendKeys(usernm);
	}

}