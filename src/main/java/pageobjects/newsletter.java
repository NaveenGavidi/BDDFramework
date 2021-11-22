package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class newsletter {

	public WebDriver driver;
	public ExtentTest test;
	public newsletter(WebDriver driver,ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	
		
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//button[@id='subscribe']")
	WebElement subscribe;
	
	
		
		public WebElement email() {
			
			return email;
		}
		
		public WebElement subscribe() {
			
			return subscribe;
		}

}
