package com_ActiTime_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title is matching");
			Reporter.log("Matching Title is ="+title, true);
		}
		catch (Exception e)
		{
			Reporter.log("Tile is not matching", true);
			Reporter.log("Matching title is =" +driver.getTitle(), true);
			Assert.fail();//Incase element is present and we need to terminate the execution then we use this
		}
	}
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present...",true);
		}
		catch (Exception e)
		{
			Reporter.log("element is not Present...", true);
			Assert.fail();//Incase element is present and we need to terminate the execution then we use this
		}
	}
	

}
