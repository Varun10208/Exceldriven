package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class baseclass {

	WebDriver driver;
	String url="http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/";

	public baseclass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[contains(text(),'First Name')]")
	WebElement labelfname;
    @FindBy(xpath = "//label[contains(text(),'Last Name')]")
	WebElement labellname;
	@FindBy(xpath = "//label[contains(text(),'Email')]")
	WebElement email;
	@FindBy(xpath = "//label[contains(text(),'Current Company')]")
	WebElement company;
	@FindBy(xpath = "//label[contains(text(),'Mobile No')]")
	WebElement mobilenumber;
	@FindBy(xpath = "//label[contains(text(),'Date of Birth')]")
	WebElement dob;
	@FindBy(xpath = "//label[contains(text(),'Position you are applying for')]")
	WebElement position;
	@FindBy(xpath = "//label[contains(text(),'Portfolio Website')]")
	WebElement portfolio;
	@FindBy(xpath = "//label[contains(text(),'Salary requirements')]")
	WebElement salary;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	public WebElement Firstname() {
		return labelfname;
	}
	public WebElement Lastname() {
		return labellname;
	}
	public WebElement Email() {
		return email;
	}
	public WebElement Company() {
		return company;
	}
	public WebElement Submit() {
		return submit;
	}

}
