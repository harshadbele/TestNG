package First_TestNG;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.openqa.selenium.interactions.Action;

public class IRCTC_Registration {

	WebDriver driver;
	String url="https://www.irctc.co.in/nget/train-search";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();

		driver.navigate().to(url);

		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException
	{
//Username and Password
		driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("Dashankush");
		driver.findElement(By.xpath("//*[@id='usrPwd']")).sendKeys("Dashankush12");
		driver.findElement(By.xpath("//*[@id='cnfUsrPwd']")).sendKeys("Dashankush12");
		WebElement element=driver.findElement(By.xpath("//*[@id='divMain']/div/app-user-registration/div/div/div[2]/div[4]/form/div[5]/div[2]/p-dropdown/div/label"));
		element.click();

		WebElement element_2=driver.findElement(By.xpath("//span[contains(text(),'What is your favorite past-time?')]"));
		//	element_2.click();

        Actions builder=new Actions(driver);
		org.openqa.selenium.interactions.Action series_action=builder.moveToElement(element)
				//			    .click()                    
				.moveToElement(element_2)
				.click()
				.build();

		series_action.perform();
       
		
		driver.findElement(By.xpath("//input[@formcontrolname='secAns']")).sendKeys("Harshad");;
		WebElement lang=driver.findElement(By.xpath("//label[contains(text(),'Select Preferred Language')]"));
		lang.click();

		WebElement lang2=driver.findElement(By.xpath("//span[contains(text(),'English')]"));

		Actions builder2=new Actions(driver);
		org.openqa.selenium.interactions.Action series_action2=builder2.moveToElement(lang)
				.moveToElement(lang2)
				.click()
				.build();

		series_action2.perform();

//Personal Details
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Harshad");
		driver.findElement(By.xpath("//*[@id='middleName']")).sendKeys("Bhalc");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Bele");
		
		driver.findElement(By.xpath("//*[@id='M']")).click();

		//Calender
        driver.findElement(By.xpath("//p-calendar[@formcontrolname='dob']")).click();
        driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[1]/option[@value='11']")).click();
        driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[2]/option[95]")).click();
        driver.findElement(By.xpath("//div/table/tbody/tr[5]/td[1]")).click();
        
        
        
		driver.findElement(By.xpath("//label[contains(text(),'Select Occupation')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'STUDENT')]")).click();
	    driver.findElement(By.xpath("//input[@value='U']")).click();
	    
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//option[contains(text(),'Select a Country')]")).click();
	    driver.findElement(By.xpath("//select[@formcontrolname='resCountry']/option[@value='3']")).click();
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("beleharshad@gmail.com");
	    driver.findElement(By.xpath("//*[@id='isd']")).sendKeys("91");
	    driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("8983001230");
	    driver.findElement(By.xpath("//select/option[contains(text(),'Select a Nationality')]")).click();
	    driver.findElement(By.xpath("//select[@formcontrolname='nationality']/option[@value='94']")).click();
	    Thread.sleep(3000);
	    
//Residential Address
	    driver.findElement(By.xpath("//*[@id='resAddress1']")).sendKeys("L703");
	    driver.findElement(By.xpath("//*[@id='resAddress2']")).sendKeys("Chinchwad");
	    driver.findElement(By.xpath("//*[@id='resAddress3']")).sendKeys("Pune");
	    driver.findElement(By.xpath("//input[@formcontrolname='resPinCode']")).sendKeys("411019");
	    driver.findElement(By.xpath("//*[@id='resState']")).sendKeys("Maharashtra");
	    driver.findElement(By.xpath("//*[@id='resCity']")).sendKeys("Pune");
	    driver.findElement(By.xpath("//*[@id='resPostOff']")).sendKeys("Chinchwad");
	    driver.findElement(By.xpath("//*[@id='resPhone']")).sendKeys("9970171951");
	    driver.findElement(By.xpath("//div[@class='col-md-1 col-sm-1 col-xs-12 inlineBlock']/input[@value='Y']")).click();
	    Thread.sleep(4000);
	    //driver.findElement(By.xpath("//div[@class='col-md-12 col-sm-7 col-xs-12 inlineBlock']/input[@formcontrolname='termCondition' and @type='checkbox']")).click();


        //driver.findElement(By.xpath("//div[@class='col-md-12 col-sm-7 col-xs-12 inlineBlock']/input[@formcontrolname='termCondition']")).click();
	
	driver.findElement(By.xpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[23]/div/input")).click();
	}

}
