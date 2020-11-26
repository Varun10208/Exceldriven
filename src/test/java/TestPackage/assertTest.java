package TestPackage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.commontasks;
import io.github.bonigarcia.wdm.WebDriverManager;
	 
public class assertTest{
WebDriver driver;
//commontasks ct =new commontasks(driver);
	@Test(enabled=true)
	 public void softAssert() throws IOException{
		 
	 SoftAssert softAssert= new SoftAssert();
	    //Goto guru99 site
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	commontasks ct =new commontasks(driver);
	 System.out.println("softAssert Method Was Started");
	 driver.get("http://demo.guru99.com/V4/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 ct.takescreenshot("Guru99homepage");
	 String window1=driver.getWindowHandle();
	 System.out.println(window1);
	 softAssert.assertTrue(driver.getTitle().equalsIgnoreCase("Guru99 Bank Home Page"));
	 System.out.println("softAssert Method Was Executed");
	 softAssert.assertAll();
	 driver.quit();
	 }
	 
	 @Test(enabled=true)
	 public void hardAssert() throws IOException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	commontasks ct =new commontasks(driver);
	driver.get("http://www.google.com");
	ct.takescreenshot("Google");
	System.out.println("hardAssert Method Was Started");
	Assert.assertTrue(true);
	System.out.println("hardAssert Method Was Executed");
	driver.quit();
	 }
	 
	}
