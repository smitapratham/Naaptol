package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.NaptoolHomePage;

public class NaaptolHomePageTest extends BaseTest
{
	@BeforeMethod
	
	public void openBrowser()
	{
		driver=LaunchBrowser.openBrowser();
	}
	@Test
	public void NaaptolLoginTest() throws InterruptedException 
	{
		NaptoolHomePage obj1=new NaptoolHomePage(driver);
		obj1.clickOnLoginOrRegister();
		obj1.enterMobileNumber("9822555941");
		obj1.clickOnContinue();
		Thread.sleep(50000);
		Assert.assertEquals(obj1.getUserName(),"Smita");
		
		
	}
	

}
