package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultPage 
{

    @FindBy(xpath = "//div[@class=\"grid_Square \"]")
    private List<WebElement> products;
    @FindBy(xpath = "//a[@href='#QuickView']")
    private List<WebElement> quickView;
    @FindBy(xpath = "//div[@class='item_title']//a")
    private List<WebElement> productTitle;
    
    @FindBy(xpath = "//div[@id='square_Details']/h1")
    private WebElement quickViewProductTitle;//confirm
    @FindBy(xpath = "//a[@id='cart-panel-button-0']")
    private WebElement clickHereToBuyButton;//confirm
    @FindBy(xpath = "//input[@id='pincodeDeliveryId_0']")
    private WebElement enterPinCode;//confirm
    @FindBy(xpath=" //li[@id='productPriceDisplay']/span[2]")
    private WebElement amountonQVtab;
    
  //*[@id="productPriceDisplay"]/span[2]-->amout on QV
  //*[@id="productPriceDisplay"]/span[2]//span[2]->shipping on QVtab
    @FindBy(xpath = "//div[@id='pincodeForDeliveryDiv_provide_0']/a/span")
    private WebElement checkButton;
    @FindBy(xpath="(//a[text()='Proceed to Checkout'])[1]")
    private WebElement proceedtocheckoutButton;
    @FindBy(xpath="//a[text()='Blue']")private WebElement bluebutton;
    @FindBy(xpath="//a[text()='Gold']")private WebElement goldbutton;
   // @FindBy(xpath="(//a[text()='I Kall Big Battery Big Screen Mobile (K37)'])[2]")
    //private WebElement cartproduct1;
    
    
    //to be done all for common-->done update
  
    @FindBy(xpath="//div[@class='item_title']//a")
    private WebElement cartproduct1;
    
  
  
    @FindBy(xpath="//*[@id=\"square_Details\"]/h1")
    private WebElement cartproduct11;
  @FindBy (xpath="//li[text()='999']")private WebElement price;

  @FindBy (xpath="//li[text()='201']")private WebElement shipping;
  

  @FindBy (xpath="//li[text()='1,200']")private WebElement  orderamt;


    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public int getNumberOfProductDisplayedAfterSearch(){
        return products.size();
    }
    public void moveToDesiredProduct(WebDriver driver, int index){
        Actions actions=new Actions(driver);
        actions.moveToElement(products.get(index));
        actions.perform();
    }
    public void clickOnDesiredProduct(int index){
        products.get(index).click();
    }
    public String getProductTitle(int index){
        return productTitle.get(index).getText();
    }
    public void clickOnQuickView(int index){
        quickView.get(index).click();
    }
    public String getProductTitleFromQuickViewTab(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(quickViewProductTitle));
        return quickViewProductTitle.getText();
    }
    public void clickOnClickHereToBuyButton(){
        clickHereToBuyButton.click();
    }
    public void enterPinCode(String pincode){
        enterPinCode.sendKeys(pincode);
    }
    public void clickOnCheckButton(){
        checkButton.click();
    }
    public void bluebutton1()
    {
    	bluebutton.click();
    }
    public void goldbutton1()
    {
    	goldbutton.click();
    }
    
    public String cartwindow()
    {
    	return cartproduct1.getText();
    }
    
    public String cartwindow11()
    {
    	return cartproduct11.getText();
    }
public void checkout()
{
	proceedtocheckoutButton.click();
}
/*public String getOrderAmount1(WebDriver driver) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
    wait.until(ExpectedConditions.visibilityOf(amountonQVtab));
    return amountonQVtab.getText();
}*/

public int getOrderAmount1() 
{
	
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
    //String pp= productPrice.get(0).getText().replaceAll("[^0-9]","");
	//999 + 201 Shipping--eg amount
	String s1=amountonQVtab.getText();
	String s2=s1.substring(0,3);
	String s3=s1.substring(6,9);
    int QVpriceProduct=Integer.parseInt(s2);
    System.out.println("Qvprice->"+QVpriceProduct);
    int QVshippingprice=Integer.parseInt(s3);
    System.out.println("QVshipp->"+QVshippingprice);
    return (QVshippingprice+QVpriceProduct);
    }




	/*@FindBy(xpath="//div[@class='grid_Square ']")private List<WebElement> products;
  @FindBy(xpath="//a[@href='#QuickView']") private WebElement quickView;
  @FindBy(xpath="//div[@class='item_title']//a")private List<WebElement> productTitle;
public SearchResultPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public int getNumberOfProductDisplayedAfterSearch()
{
	return products.size();
}

public void moveToDesiredProduct(WebDriver driver,int index)
{
	Actions actions=new Actions(driver);
	actions.moveToElement(products.get(index));
	actions.perform();
}
public void clickOnDesiredProduct(int index)
{
	products.get(index).click();
}
public String getProductsTitle(int index)
{
	return productTitle.get(index).getText();
}
public void clickOnQuickView()
{
	quickView.click();
}*/



  
}
