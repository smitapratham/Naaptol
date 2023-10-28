package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.AddProductToCartFromProddespPage;
import pom.AddProductToCartFromQuickViewPage;
import pom.NaptoolHomePage;
import pom.SearchResultPage;


//test cases 1 , 3 and 5 


public class AddProductToCartFromQuickViewTest extends BaseTest
{
	@BeforeMethod
	public void openBrowser()
	{
		driver=LaunchBrowser.openBrowser();
		
	}

@Test

    public void verifyIfProductIsAddedOnCart() throws InterruptedException
{
	//To add a single product 
    	NaptoolHomePage naptolHomePage=new NaptoolHomePage(driver);
        naptolHomePage.enterProductToSearch("mobile");
        naptolHomePage.clickOnSearchButton();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.moveToDesiredProduct(driver,5);
        searchResultPage.clickOnQuickView(5);
        
        String actualTitle = searchResultPage.getProductTitleFromQuickViewTab(driver);
        System.out.println("Qv-->"+actualTitle);////////QV
        int q1=searchResultPage.getOrderAmount1();
        System.out.println("Qvtotalprice"+q1);
        Thread.sleep(2000);
        
        //System.out.println("Quick view tab"+searchResultPage.getOrderAmount1(driver));//QV
        searchResultPage.enterPinCode("421301");
        searchResultPage.clickOnCheckButton();
        try {
            searchResultPage.bluebutton1();
        }catch (Exception e)
        {
            System.out.println("no such element");
        }
        //System.out.println(searchResultPage.getOrderAmount1());//QV
      //Thread.sleep(5000);
        searchResultPage.clickOnClickHereToBuyButton();
       // System.out.println("Quick view tab"+searchResultPage.getOrderAmount1(driver));//QV
        
        
        AddProductToCartFromQuickViewPage addToCartPage = new AddProductToCartFromQuickViewPage(driver);
        String CartProductTitle= addToCartPage.getcartItemsTitle(driver);
        System.out.println("cart->"+CartProductTitle);//Cart
       
        
        Assert.assertTrue(actualTitle.contains(CartProductTitle));
               
        
       
        
        int c1=addToCartPage.getOrderAmount(0);
        System.out.println("cart amount"+c1);
       
        
        
       

        	
        	Assert.assertTrue(q1==c1);
        

    
    

    }
///////////////////////////////////////////////////////////////////////

//To add multiple products
@Test
public void verifyIfMultipleProductIsAddedOnCart() throws InterruptedException
{
	
    	NaptoolHomePage naptolHomePage=new NaptoolHomePage(driver);
        naptolHomePage.enterProductToSearch("mobile");
        naptolHomePage.clickOnSearchButton();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.moveToDesiredProduct(driver,1);
        searchResultPage.clickOnQuickView(1);
        
        String actualTitle = searchResultPage.getProductTitleFromQuickViewTab(driver);
        System.out.println("Qv1-->"+actualTitle);////////QV
        int q1=searchResultPage.getOrderAmount1();
        System.out.println("Qvtotalprice1-->"+q1);
        Thread.sleep(2000);
        
       
        searchResultPage.enterPinCode("421301");
        searchResultPage.clickOnCheckButton();
//        try {
//            searchResultPage.bluebutton1();
//        }catch (Exception e)
//        {
//            System.out.println("no such element");
//        }
       Thread.sleep(2000);
        searchResultPage.clickOnClickHereToBuyButton();
      
        
        
        AddProductToCartFromQuickViewPage addToCartPage = new AddProductToCartFromQuickViewPage(driver);
        String CartProductTitle= addToCartPage.getcartItemsTitle(driver);
        System.out.println("cart1->"+CartProductTitle);//Cart
       
        
        Assert.assertTrue(actualTitle.contains(CartProductTitle));
        
        
        
        int up=addToCartPage.getUnitPriceFromAddToCart(driver, 0);
        int sp=addToCartPage.getShippingPriceFromCart(0);
       
        int upsp=up+sp;
        System.out.println("unit+shipping-->"+upsp);
        
       
        
        int c1=addToCartPage.getOrderAmount(0);
        System.out.println("cart amount-->"+c1);
        
      Assert.assertTrue(upsp==c1);

        
     
        Assert.assertTrue(q1==c1);
       
        
        
        
        //for 2nd product 	//////////////////////////////////
        	
        
        
        	AddProductToCartFromProddespPage addProductToCartFromProddespPage=new AddProductToCartFromProddespPage(driver);
        	addProductToCartFromProddespPage.continueshipping1();
        	Thread.sleep(2000);
        	searchResultPage.moveToDesiredProduct(driver,2);
        	
            searchResultPage.clickOnQuickView(2);
            
            String actualTitle2 = searchResultPage.getProductTitleFromQuickViewTab(driver);
            System.out.println("Qv2-->"+actualTitle2);////////QV
            int q2=searchResultPage.getOrderAmount1();
            System.out.println("Qvtotalprice2-->"+q2);
            Thread.sleep(2000);
          
            searchResultPage.clickOnClickHereToBuyButton();
    

           
            String CartProductTitle2= addToCartPage.getcartItemsTitle(driver);
            System.out.println("cart2->"+CartProductTitle2);//Cart
           
            
            Assert.assertTrue(actualTitle2.contains(CartProductTitle2));
            
            
            int up2=addToCartPage.getUnitPriceFromAddToCart(driver, 0);
            int sp2=addToCartPage.getShippingPriceFromCart(0);
            int ca1=addToCartPage.carttotalamt11();
            int ca2=addToCartPage.carttotalamt22();
           
            int upsp2=up2+sp2;
            int upspfinal=upsp+upsp2;
            int gift=addToCartPage.giftvoucher1();
            System.out.println("GIFT"+gift);
            System.out.println("UPSPFINAL"+upspfinal);
            System.out.println("CARTAMOUNT1-->"+ca1);
            System.out.println("CARTAMOUNT2-->"+ca2);
            
            System.out.println("unit+shipping2-->"+upsp2);
            int c2=addToCartPage.getOrderAmount(0);
            System.out.println("cart amount2-->"+c2);
           
          Assert.assertTrue(upsp2==c2);
            int finalamount=ca1-gift;
            System.out.println("fianl amount to pay-->"+finalamount);
            Assert.assertTrue(ca2==finalamount);
            
          
            	Assert.assertTrue(q2==c2);
            	
            	
            	Assert.assertTrue(ca1==upspfinal);
            	addToCartPage.proceedtocheckout();
            
    }





}
