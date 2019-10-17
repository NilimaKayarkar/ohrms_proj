package com.OHRM.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.text.SimpleAttributeSet;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Baseclass {
	public static WebDriver driver;
	public static Properties prop;
	
	public Baseclass() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\selenium software\\OHRM_project\\src\\main\\java\\com\\OHRM\\config\\config.properties");
		prop.load(fis);
	}

	public static void initialisation() {
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\selenium software\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
	}
	public void takescreenshot(String str) throws IOException {
		DateFormat df=new SimpleDateFormat("yyyy_mmm_dd hh_mm_ss");
		Date d =new Date();
		String time=df.format(d);
		System.out.println(d);
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("D:\\selenium software\\OHRM_project\\screenshot\\"+str+time+".png"));
	}
}
