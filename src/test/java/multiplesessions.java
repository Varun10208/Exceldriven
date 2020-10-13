import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	public class multiplesessions {
//	public static void main(String[] args ){
		
		@Test
		public void testsessioning() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\varuny\\eclipse-workspace\\Exceldriven\\chromedriver.exe");
	    //First session of WebDriver
	    WebDriver driver = new ChromeDriver();
	    //Goto guru99 site
	    driver.get("http://demo.guru99.com/V4/");
	    
	    //Second session of WebDriver
	//    WebDriver driver2 = new ChromeDriver();
	    //Goto guru99 site
	  //  driver2.get("http://demo.guru99.com/V4/");
	//	}
	    
	}
	}
