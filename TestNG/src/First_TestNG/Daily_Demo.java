package First_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Wrapper;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.runners.model.Statement;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Daily_Demo {
	WebDriver driver;
	String url="http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html";

	@BeforeTest
	public void setup()
	{
	 System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.navigate().to(url);
	 driver.manage().window().maximize();
	}
	

	@Test
	public void test_PopUp() throws InterruptedException, IOException
	{
         String url="jdbc.mysql.//localhost:3036/emp";
         
         String username="hadh";
         
         String password="password";
         
         String query="Select *from emp;";
         
         //Class.forName(jdbc.driver);
         
         /*Connection con=DriverManager.getConnection(url);
         
        java.sql.Statement stment=con.createStatement();
         
         ResultSet rs=stment.executeQuery(query);
         
         while(!rs.next())
         {
        	String din=rs.getString(1);
        	
         }
	}
	*/
}
}