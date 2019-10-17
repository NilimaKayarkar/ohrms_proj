package com.OHRM.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRM.baseclass.Baseclass;

public class Homepage extends Baseclass{
	public Homepage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Welcome Admin")
	WebElement Welcomeadmin;
	
	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement AdminModule;
	
	@FindBy(xpath="//b[contains(text(),'PIM')]")
	WebElement PIMModule;
	
			
	@FindBy(xpath="//b[contains(text(),'Leave')]")
	WebElement LeaveModule;
	
	@FindBy(xpath="//b[contains(text(),'Time')]")
	WebElement TimeModule;
	
	@FindBy(xpath="//b[contains(text(),'Recruitment')]")
	WebElement RecruitmentModule;
	
	@FindBy(xpath="//b[contains(text(),'Performance')]")
	WebElement PerformanceModule;
	
	@FindBy(xpath="//b[contains(text(),'Dashboard')]")
	WebElement DashboardModule;
	
	@FindBy(xpath="//b[contains(text(),'Directory')]")
	WebElement DirectoryModule;
	
	@FindBy(xpath="//input[@value='Add'][@name='btnAdd']")
	WebElement Addbutton;

	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	}

