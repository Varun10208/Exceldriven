package TestPackage;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sourcefuse {

	WebDriver driver;
	private Connection connection;
	private static Statement statement;
	private static ResultSet rs;
	

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 String databaseURL = "jdbc:mysql://localhost:3306/easy";
         String user = "root";
         String password = "root";
         connection = null;
         try {
             Class.forName("com.mysql.jdbc.Driver");
             System.out.println("Connecting to Database...");
             connection = DriverManager.getConnection(databaseURL, user, password);
             if (connection != null) {
                 System.out.println("Connected to the Database...");
             }
         } catch (SQLException ex) {
            ex.printStackTrace();
         }
         catch (ClassNotFoundException ex) {
            ex.printStackTrace();
         }}

	@Test
	public void testcase1() {
		baseclass b = new baseclass(driver);
        driver.get(b.url);
        driver.manage().window().maximize();
        System.out.println("Label of First Name textbox is " + b.Firstname().getText());
		System.out.println("Lable of Last name textbox is " + b.Lastname().getText());
		System.out.println("Lable of Email textbox " + b.Email().getText());
		System.out.println("Lable of Company is " + b.Company().getText());
	    b.Submit().click();

	}
	
	@Test
	public void testcase2() {
		baseclass b = new baseclass(driver);
		SoftAssert sa= new SoftAssert();
		sa.assertTrue(b.Firstname().isEnabled());
		System.out.println("First Name textbox is enabled");
		sa.assertTrue(b.Lastname().isEnabled());
		System.out.println("Last Name textbox is enabled");
		sa.assertTrue(b.Email().isEnabled());
		System.out.println("Email Name textbox is enabled");
		sa.assertAll();}
	
	@Test
	public void testcase3() {
		baseclass b = new baseclass(driver);
	    Assert.assertEquals(true,b.Firstname().isEnabled());
		System.out.println("First Name textbox is enabled");
		Assert.assertTrue(b.Lastname().isEnabled());
		System.out.println("Last Name textbox is enabled");
		Assert.assertTrue(b.Email().isEnabled());
		System.out.println("Email Name textbox is enabled");}
	@Test
	public void testcase4() throws InterruptedException {
		baseclass b = new baseclass(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		b.Firstname().sendKeys("Rahul");
		b.Lastname().sendKeys("Kumar");
		b.Email().sendKeys("rahul@sourcefuse.com");
		b.Submit().click();

	}
	
	public void testcase5() {
		  try {
	            String query = "select * from sourcefuse where first_name=\"Rahul Kumar\"";
	            statement = connection.createStatement();
	            rs = statement.executeQuery(query);

	            while(rs.next()){
	            	String EmpFirstName=rs.getString("EmpFirstName");
	                String EmpLastName= rs.getString("EmpLastName");
	                Double EmpSal= rs.getDouble(5);
	                System.out.println(EmpFirstName+"\t"+EmpLastName+"\t"+"\t"+EmpSal);
	            }
	        } catch (SQLException ex) {
	           ex.printStackTrace();
	        }
		
	}
	
	
	
	
	
	
	@AfterClass
	public void teardown() {
		   if (connection != null) {
               try {
                   System.out.println("Closing Database Connection...");
                   connection.close();
               } catch (SQLException ex) {
                   ex.printStackTrace();
               }
           }
		driver.quit();
	}

}
