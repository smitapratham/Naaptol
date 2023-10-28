package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.NaptoolHomePage;
import pom.SearchResultPage;

public class NaptolProductSearchTest extends BaseTest 
{
	@BeforeMethod
	public void openBrowser()
	{
		driver=LaunchBrowser.openBrowser();
		
	}
	@Test
	public void productSearchTest()
	{
		NaptoolHomePage obj1=new NaptoolHomePage(driver);
		obj1.enterProductToSearch("mobile");
		obj1.clickOnSearchButton();
		SearchResultPage obj2=new SearchResultPage(driver);
		int products=obj2.getNumberOfProductDisplayedAfterSearch();
		//System.out.println("jjjjj"+products);
		Assert.assertTrue(products>0);
		Assert.assertTrue(driver.getTitle().contains("mobile"));
	}
	
	@Test
	public void verifyIfProductIsVisibleInQuickViewTab() throws InterruptedException
	{
		NaptoolHomePage obj1=new NaptoolHomePage(driver);
		obj1.enterProductToSearch("mobile");
		obj1.clickOnSearchButton();
		SearchResultPage obj2=new SearchResultPage(driver);
		String title=obj2.getProductTitle(3);
		System.out.println(title);///////////////////////////////
		obj2.moveToDesiredProduct(driver, 3);
		obj2.clickOnQuickView(3);
		////a[@id='cart-panel-button-0']
        String actualTitle = obj2.getProductTitleFromQuickViewTab(driver);
        System.out.println(actualTitle);////////////////////
//        Assert.assertEquals(title,actualTitle);
        Assert.assertTrue(actualTitle.contains(title));
        obj2.enterPinCode("421301");
        obj2.clickOnCheckButton();
        obj2.bluebutton1();
        obj2.clickOnClickHereToBuyButton();
      
        System.out.println(obj2.cartwindow());////////////////
        System.out.println(obj2.cartwindow11());/////////////////////////
        Assert.assertTrue(obj2.cartwindow().equals(obj2.cartwindow11()));
        Thread.sleep(2000);
        System.out.println("successfully added to cart");
        	
        Thread.sleep(2000);
        obj2.checkout();
      

	}

}
