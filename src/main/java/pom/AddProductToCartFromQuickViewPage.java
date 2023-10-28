package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddProductToCartFromQuickViewPage
{
	////ul[@id='cartData']//h2//a-->cart items xpath
    @FindBy(xpath = "//ul[@id=\"cartData\"]/li[1]/div[2]/h2/a")
    private WebElement items;
    
  
  //ul[@id='cartData']/li[3]-->single amt
    @FindBy(xpath = "//li[@class='head_UPrice']")
    private List<WebElement> cartunitPrice;
    
  
  //ul[@id='cartData']/li[4]-->single amt
    @FindBy(xpath = "//li[@class='head_ship']")
    private List<WebElement> cartShippingCharge;
    
  
    @FindBy(xpath = "//li[@class='head_Amount']")
    private List<WebElement> cartorderAmount;
    
    
    @FindBy(xpath = "//ul[@id='cartData']/li[5]")
    private WebElement carttotalorderAmount;
    
  //ul[@id=\"shopCartHead\"]/li[2]/a[1] 
    @FindBy(xpath = "//ul[@id='shopCartHead']/li[2]/a[1]")
    private WebElement ContinueShopping;
    
  
    @FindBy(xpath = "//ul[@id='cartTotal']/li[4]/a[1]")
    private WebElement ContinueShoppingdownbutton;
    
  
    @FindBy(xpath = "//ul[@id=\"cartTotal\"]/li[4]/a[2]")
    private WebElement checkoutbutton;
    
  //ul[@id=\"cartData\"]/li[1]/div[2]/p[3]/a
  
    @FindBy(xpath = "//ul[@id='cartData']/li[1]/div[2]/p[3]/a")
    private WebElement Remove;
    /////////////////////////////////
  //span[@id='totalPayableAmount'] 
    
  
    @FindBy(xpath = "//ul[@id='cartTotal']/li[1]/label")
    private WebElement carttotalamt1;
    
   
    @FindBy(xpath = "//ul[@id='cartTotal']/li[3]/label")
    private WebElement carttotalamt2;
    
    @FindBy(xpath = "//ul[@id=\"cartTotal\"]/li[2]/label")
    private WebElement giftvoucher;
    
  







    public AddProductToCartFromQuickViewPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public String getcartItemsTitle(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(items));
       return items.getText();
    }
    
   /* public String getUnitPrice(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(unitPrice));
        return unitPrice.getText();
    }*/
    public int getUnitPriceFromAddToCart(WebDriver driver,int index)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOfAllElements(cartunitPrice));
    	
        
    	
    	
		String up= cartunitPrice.get(index+1).getText().replaceAll("[^0-9]","");
		int cartpriceUnit=Integer.parseInt(up);
		return cartpriceUnit;
	}

    /*public String getShippingCharge() {
        return ShippingCharge.getText();
    }*/
    
    public int getShippingPriceFromCart(int index) {
		String sp=cartShippingCharge.get(index+1).getText().replaceAll("[^0-9]","");
		int cartpriceshipping=Integer.parseInt(sp);
		return cartpriceshipping;
	}

    /*public String getOrderAmount(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(orderAmount));
        return orderAmount.getText();
    }*/
    
    public int getOrderAmount(int index) {
		String oa=cartorderAmount.get(index+1).getText().replaceAll("[^0-9]","");
		int cartamountOrder=Integer.parseInt(oa);
		return cartamountOrder;
	}

    public String  getCartAmount(){
		String ca=carttotalorderAmount.getText();
		return ca;
	}

    public int carttotalamt11()
    {
    	String s1= carttotalamt1.getText().replaceAll("[^0-9]","");;
    	int a1=Integer.parseInt(s1);
    	return a1;
    }
    
    public int carttotalamt22()
    {
    	String s1= carttotalamt2.getText().replaceAll("[^0-9]","");;
    	int a2=Integer.parseInt(s1);
    	return a2;
    }
    
   public int giftvoucher1()
   {
	   String s1= giftvoucher.getText().replaceAll("[^0-9]","");;
   	int a2=Integer.parseInt(s1);
   	return a2;
   
   }
    public void ContinueShopping(){
        ContinueShopping.click();
    }
    
    
    public void ContinueShoppingDB()
    {
    	ContinueShoppingdownbutton.click();
    }
    
  
    public void proceedtocheckout()

    {
    	checkoutbutton.click();
    }
    public void ClickOnRemoveProduct(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(Remove));
        Remove.click();
    }
    

	
}
