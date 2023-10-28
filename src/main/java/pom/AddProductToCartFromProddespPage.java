package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductToCartFromProddespPage 
{
	@FindBy (xpath="//div[@class='item_title']//a")
	private List<WebElement> productonmainpage;
	
	//tile of next page ->/html/head/title/text()
	@FindBy(xpath="//div[@id='square_Details']/h1")
	private WebElement productonproddesppage;
	
	@FindBy(xpath="//a[@id=\"cart-panel-button-0\"]/span")
private WebElement clicktobuyoption;
	
	@FindBy(xpath="//input[@id=\"pincodeDeliveryId_0\"]")
	private WebElement pincode;
	
	@FindBy(xpath="//div[@id=\"pincodeForDeliveryDiv_provide_0\"]/a/span")
	private WebElement checkpincode;
	
	@FindBy(xpath="//ul[@id=\"cartData\"]/li[1]/div[2]/h2/a")
	private List<WebElement> iteminCart;
	
	
	
	@FindBy(xpath="//ul[@id=\"shopCartHead\"]/li[2]/a[1]")
	private WebElement continueshipping;
	
	///////////////////////////////////////////////////////////
	
	
	public AddProductToCartFromProddespPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void productsonmainpage(int index)
	{
		productonmainpage.get(index).click();
		//for(int i=0;i<productonmainpage.size();i++) {
			//WebElement img1=productonmainpage.get(i);
			//img1.click();
			//String title=img1.getText();
			//System.out.println(title);}//
	}
	
	public String productonproddesppage1()
	{
		return productonproddesppage.getText();
	}
	
	public void clicktobuyoption1()
	{
		clicktobuyoption.click();
	}
	
	public void pincode1(String pincodevalue)
	{
		pincode.sendKeys(pincodevalue);
	}

	public void checkpincode1()
	{
		checkpincode.click();
	}
	
	public String iteminCart1(int index)
	{
		return iteminCart.get(index).getText();
		
	}
	
	public void continueshipping1()
	{
		continueshipping.click();
	}
}
