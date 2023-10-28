package test;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.AddProductToCartFromProddespPage;
import pom.AddProductToCartFromQuickViewPage;
import pom.NaptoolHomePage;
import pom.SearchResultPage;

public class AddProductToCartFromProddespPageTest extends BaseTest
{
	
	//test cases 2 and 4
	
	@BeforeMethod
	public void openBrowser()
	{
		driver=LaunchBrowser.openBrowser();
		
	}
	@Test
	 public void verifyIfOneProductIsAddedOnCart() throws InterruptedException
	 {
		
		//for single product
		
		
		NaptoolHomePage naptolHomePage=new NaptoolHomePage(driver);
    	String handle1=driver.getWindowHandle();
    	 System.out.println("address of main page"+handle1);
        naptolHomePage.enterProductToSearch("mobile");
        naptolHomePage.clickOnSearchButton();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
       AddProductToCartFromProddespPage addProductToCartFromProddespPage=new AddProductToCartFromProddespPage(driver);
        addProductToCartFromProddespPage.productsonmainpage(5);
        ///////////////////////////////////////////////////
      //Thread.sleep(2000);
    	Set<String> handles=driver.getWindowHandles();
		Iterator<String>i=handles.iterator();
		
		while(i.hasNext()) {
			String handle=i.next();
			driver.switchTo().window(handle);
			String currentTitle=driver.getTitle();
			///Thread.sleep(2000);
			if(currentTitle.contains("Kall Big Battery Big Screen Mobile"))
				/////how to gettile specifically of another page to match
{

			
			try {
	            searchResultPage.bluebutton1();
	        }catch (Exception e)
			{
	            System.out.println("no such element");
	        }
//				
			
			addProductToCartFromProddespPage.pincode1("421301");
//
addProductToCartFromProddespPage.checkpincode1();
int q1=searchResultPage.getOrderAmount1();
System.out.println("Qvtotalprice"+q1);
addProductToCartFromProddespPage.clicktobuyoption1();
////////////////////////////////////////////////


String itemonpage=addProductToCartFromProddespPage.productonproddesppage1();
System.out.println("on page1-->"+itemonpage);
Thread.sleep(3000);
String itemincart=addProductToCartFromProddespPage.iteminCart1(0);
AddProductToCartFromQuickViewPage addToCartPage = new AddProductToCartFromQuickViewPage(driver);
int c1=addToCartPage.getOrderAmount(0);
System.out.println("cart amount"+c1);

System.out.println("cart1--->"+itemincart);

Assert.assertTrue(itemincart.equals(itemonpage));
Assert.assertTrue(q1==c1);
}}
		
	 }
	
	
	///////////////////////////////////////////////////////////////////////////////
	///To add  multiple items
	////////////////////
	
	

	@Test

    public void verifyIfProductIsAddedOnCart() throws InterruptedException{
    	NaptoolHomePage naptolHomePage=new NaptoolHomePage(driver);
    	String handle1=driver.getWindowHandle();
    	 System.out.println("address of main page"+handle1);
        naptolHomePage.enterProductToSearch("mobile");
        naptolHomePage.clickOnSearchButton();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
       AddProductToCartFromProddespPage addProductToCartFromProddespPage=new AddProductToCartFromProddespPage(driver);
        addProductToCartFromProddespPage.productsonmainpage(5);
        ///////////////////////////////////////////////////
      //Thread.sleep(2000);
    	Set<String> handles=driver.getWindowHandles();
		Iterator<String>i=handles.iterator();
		
		while(i.hasNext()) {
			String handle=i.next();
			driver.switchTo().window(handle);
			String currentTitle=driver.getTitle();
			///Thread.sleep(2000);
			if(currentTitle.contains("Kall Big Battery Big Screen Mobile"))
				/////how to gettile specifically of another page to match
{

			
			try {
	            searchResultPage.bluebutton1();
	        }catch (Exception e)
			{
	            System.out.println("no such element");
	        }
//				
			
			addProductToCartFromProddespPage.pincode1("421301");
//
addProductToCartFromProddespPage.checkpincode1();
int q1=searchResultPage.getOrderAmount1();
System.out.println("Qvtotalprice1->"+q1);
addProductToCartFromProddespPage.clicktobuyoption1();
////////////////////////////////////////////////


String itemonpage=addProductToCartFromProddespPage.productonproddesppage1();
System.out.println("on page1-->"+itemonpage);
Thread.sleep(3000);
String itemincart=addProductToCartFromProddespPage.iteminCart1(0);
AddProductToCartFromQuickViewPage addToCartPage = new AddProductToCartFromQuickViewPage(driver);
int c1=addToCartPage.getOrderAmount(0);
System.out.println("cart amount1->"+c1);

System.out.println("cart1--->"+itemincart);

Assert.assertTrue(itemincart.equals(itemonpage));
Assert.assertTrue(q1==c1);
addProductToCartFromProddespPage.continueshipping1();

driver.switchTo().window(handle1);
Thread.sleep(3000);
	}
	}
		/////////////////////////////
		
		
		
		//NaptoolHomePage naptolHomePage=new NaptoolHomePage(driver);
    	//String handle1=driver.getWindowHandle();
    	// System.out.println("address of main page"+handle1);
       // naptolHomePage.enterProductToSearch("mobile");
        //naptolHomePage.clickOnSearchButton();
        //SearchResultPage searchResultPage = new SearchResultPage(driver);
       //AddProductToCartFromProddespPage addProductToCartFromProddespPage=new AddProductToCartFromProddespPage(driver);
      addProductToCartFromProddespPage.productsonmainpage(3);
   
        Set<String> handles2=driver.getWindowHandles();
		Iterator<String>i1=handles2.iterator();
       Thread.sleep(3000);
while(i1.hasNext()) {
String handle=i1.next();
			driver.switchTo().window(handle);
			String currentTitle=driver.getTitle();
			
		
			if(currentTitle.contains("Smart Watch with Free Magnetic Bluetooth Earphones And Mobile Stand"))
			/////how to gettile specifically of another page to match
			{Thread.sleep(2000);
	///////////		/	System.out.println("otttttt"+currentTitle);
			
			
			int q2=searchResultPage.getOrderAmount1();
			System.out.println("Qvtotalprice2->"+q2);
				addProductToCartFromProddespPage.clicktobuyoption1();
				String itemonpage=addProductToCartFromProddespPage.productonproddesppage1();
				System.out.println("on page2---->"+itemonpage);
				Thread.sleep(3000);
				String itemincart1=addProductToCartFromProddespPage.iteminCart1(0);
				AddProductToCartFromQuickViewPage addToCartPage = new AddProductToCartFromQuickViewPage(driver);
				int c2=addToCartPage.getOrderAmount(0);
				System.out.println("cart amount2->"+c2);

				System.out.println("cart2--->"+itemincart1);
				Assert.assertTrue(itemincart1.equals(itemonpage));
				Assert.assertTrue(q2==c2);
}}
		
//			System.out.println("cart"+itemincart);
//
//			Assert.assertTrue(itemincart.equals(itemonpage));
//	
        
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
