package com.OHRM.testcasescript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OHRM.baseclass.Baseclass;
import com.OHRM.pages.Loginpage;

public class LoginpageTest extends Baseclass {
	com.OHRM.pages.Homepage hp;
	Loginpage lp;
	  String loginpageimg;
	 public LoginpageTest() throws Exception {
		super();
	}
	
	 
  @BeforeTest
  public void setup() throws IOException {
	  initialisation();
	  lp=new Loginpage();
	  
  }
  @Test(priority = 1)
  public void loginpagetitletest() {
	  String title=lp.validateloginPageTitle();
	  Assert.assertEquals(title, "OrangeHRM");
  }
  @Test(priority = 2)
  public void logintest() throws Exception {
	 takescreenshot(loginpageimg);
	 hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
  }
}
