package com.OHRM.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRM.baseclass.Baseclass;

public class Loginpage extends Baseclass {
	public Loginpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(name="txtUsername")
	WebElement txtUsername;
	
	@FindBy(name="txtPassword")
	WebElement txtPassword;
	
	@FindBy(xpath=".//*[@value='LOGIN']")
	WebElement LoginButton;
	
	public String validateloginPageTitle(){
		return driver.getTitle();

}
	public Homepage login(String un,String pwd) throws Exception{
		txtUsername.sendKeys(un);
		txtPassword.sendKeys(pwd);
	    LoginButton.click();
	return new Homepage();
}
}