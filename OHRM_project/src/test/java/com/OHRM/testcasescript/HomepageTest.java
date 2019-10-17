package com.OHRM.testcasescript;

import org.testng.annotations.Test;

import com.OHRM.baseclass.Baseclass;
import com.OHRM.pages.Loginpage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class HomepageTest extends Baseclass{
	com.OHRM.pages.Homepage hp;
	Loginpage lp;
	
	 public HomepageTest() throws IOException  {
		super();
	}
  @Test
  public void verifyhomepagetitletest() {
	  String homePageTitle=hp.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "OrangeHRM","Homepage title not matched");
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  initialisation();
	  lp=new Loginpage();
	  hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
		String Homepageimg = null ;
		takescreenshot("Homepageimg");
  }

}
