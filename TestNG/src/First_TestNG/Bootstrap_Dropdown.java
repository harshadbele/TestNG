package First_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bootstrap_Dropdown {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver;
		String url="http://gmail.com";

		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");

		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();



		 driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
         driver.findElement(By.id("firstName")).sendKeys("Harshad");
         driver.findElement(By.id("lastName")).sendKeys("Bele");
         driver.findElement(By.id("username")).sendKeys("dash123harshad@gmail.com");
         driver.findElement(By.name("Passwd")).sendKeys("harshad_234");
         driver.findElement(By.name("ConfirmPasswd")).sendKeys("harshad_234");
         driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 driver.findElement(By.xpath("//div[@class='e2CuFe eU809d']")).click();
         driver.findElement(By.xpath("//div[@jsname='wQNmvb']/content[contains(text(),'Algeria')]/span[@class='CO1lLb']")).click();

		/*driver.get("C:\\Users\\admin\\Desktop\\BootStrap_Menu.html");
		driver.findElement(By.xpath("//*[contains(text(),'Dropdown Example')]")).click();
		Thread.sleep(2000);
		List <WebElement> element=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));

		System.out.println(element.size());

		
		for(WebElement ele:element)
		{
			System.out.println(ele.getText());
			if(ele.getText().contains("Algeria"))
			{
				ele.click();
				break;
			}
		}
		
		
		/*
		for(int i=0;i<element.size();i++)
		{

			String element_value=element.get(i).getAttribute("innerHTML");

			System.out.println("element_value:"+element_value);
			Thread.sleep(2000);
			if(element_value.equalsIgnoreCase("HTML"))
			{
				System.out.println(element_value);
				element.get(i).click();
				break;
			}
		}
		*/
		
		
	}
	
}
