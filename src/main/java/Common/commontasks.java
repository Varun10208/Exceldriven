package Common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class commontasks {
	public WebDriver driver;
	
	public commontasks(WebDriver driver){
		this.driver=driver;
	}
	public  void takescreenshot(String filename) throws IOException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("C:\\Users\\varuny\\eclipse-workspace\\Exceldriven\\src\\main\\resources\\screenshots\\"+filename+".jpeg");
		FileUtils.copyFile(file, destinationfile);
		
	}
	

}
