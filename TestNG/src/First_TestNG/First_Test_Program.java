package First_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First_Test_Program {

	@BeforeSuite
	public void before_Suite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void before_test()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void before_class()
	{
		System.out.println("Before Class");
	}
	
	
	@BeforeMethod
	public void before_method()
	{
		System.out.println("Before Method");
	}
	
	@Test(priority=-2)
	public void test_1()
	{
		System.out.println("Before Test_1:priority=-2");
		
	}
	
	@Test(priority=-1)
	public void test_2()
	{
		System.out.println("Before Test_2:priority=-1");
	}
	
	@Test(priority=0)
	public void test_3()
	{
		System.out.println("Before Test_3:priority=0");
	}
	@Test(priority=1)
	public void test_4()
	{
		System.out.println("Before Test_4:priority=1");
	}
	
	@AfterMethod
	public void after_method()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void after_class()
	{
		System.out.println("After Class");
	}
	
	@AfterTest
	public void after_test()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void after_suite()
	{
		System.out.println("After Suite");
	}
}

