package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser 
{
	public static WebDriver openBrowser()
	{//mostly in 1 project no need to give url,as it remaims same 
		//thruout project
		
		WebDriverManager.chromedriver().setup();
		
		
		//wedrivermanager dependency saved in POM from mavenrepository
		//so in future will automatically update chromeapp exe file
		//and can support any browser like.firefox ()etc...
		
		
	//System.setProperty("webdriver.chrome.driver","D:\\Arise\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.naaptol.com/");
	driver.manage().window().maximize();
	return driver;
	
	
	}


}
