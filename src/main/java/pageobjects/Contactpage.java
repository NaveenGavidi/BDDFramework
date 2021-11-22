package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Contactpage{
	public WebDriver driver;
	public ExtentTest test;
	public Contactpage(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Contact us')][1]")
	WebElement contactus;
	@FindBy(xpath="//input[@name='contact[name]']")
	WebElement Name;
	@FindBy(xpath="//input[@name='contact[email]']")
	WebElement Email;
	@FindBy(xpath="//textarea[@name='contact[body]']")
	WebElement Message;
	@FindBy(xpath="//button[contains(text(),'Send')][1]")
	WebElement send;

	@FindBy(xpath="//p[@class='note note--success']")
	WebElement sending_confirmation;
	
	public WebElement Contact_us() {
		return contactus;
	}	
	public WebElement Name() {
		return Name;
	}
	public WebElement EmailID() {
		return Email;
	}
	public WebElement MessageBox() {
		return Message;
	}
	public WebElement Send() {
		return send;
	}
	public WebElement Sending_confirmation() {
		return sending_confirmation;
	}
}
