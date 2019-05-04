package First_TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(First_TestNG.Listner_Demo.class)
public class Listner_Test_Demo {

	
	@Test 
	public void test_1()
	{
		System.out.println("Test successful dummy");
	Assert.assertEquals(4,4);	
	}
	
	@Test
	public void test_2()
	{
		System.out.println("Listner_Test_Demo.test_2()..Fail");
		Assert.assertEquals(2, 1);
	}
	
}
