package TestListners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListners.Listners.class)

public class Reporting {
	
	@Test
	
public void Test_Success()
{
	System.out.println("This is my success scenario test");	
}
	
	@Test
	public void Test_Failure()
	{
		System.out.println("This is my Failure scenario test");	
		
		Assert.assertTrue(false);
	}

	@Test
	public void Test_Skipped()
	{
		throw new SkipException("This test is skipped");	
	}
}
