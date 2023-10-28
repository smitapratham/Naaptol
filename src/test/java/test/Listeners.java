package test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshotprogm;

public class Listeners extends BaseTest implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("on test start "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("on test success "+result.getName());
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		//System.out.println("on test failure "+result.getName());
		try
		{
			Screenshotprogm.takescreenShot(driver, result.getName());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("on test Skipped "+result.getName());
		
	}
	
	public void onTestFinish(ITestResult result)
	{
		System.out.println("on test Finish "+result.getName());
		
	}

}
