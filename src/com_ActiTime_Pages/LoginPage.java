package com_ActiTime_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_ActiTime_Generic.BasePage;

public class LoginPage extends BasePage 
{
	//DECLARATION
	@FindBy (id="Username")
	private WebElement unTB;
	
	@FindBy (name="pwd")
	private WebElement pwTB;
	
	@FindBy (xpath="//div[.='Login ']");
	private WebElement lgBT;
	
	@FindBy (xpath="//span[.='Username or Password is invalid. Please try again.']")
	private WebElement error;
	
	@FindBy (xpath="//nobr[.='actiTIME 2020 Online']")
	private WebElement version;
	
	//INITILISATION
	public LoginPage (WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);	
	}
	
	//UTILIZATION
		public void enterUserName(String un)
		{
			unTB.sendKeys(un);
		}
		public void enterPassWord(String pw)
		{
			pwTB.sendKeys(pw);
		}
		public void clickOnLogin()
		{
			lgBT.click();
		}
		public String errorMessage()
		{
			verifyElement(error);
			String aErrorMessage=error.getText();
			return aErrorMessage;
		}
		public String verifyVersion() 
		{
			verifyElement(version);
			String aVersion=version.getText();
			return aVersion;
		}
}
