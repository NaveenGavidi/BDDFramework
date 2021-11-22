package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Loginpage {

	public WebDriver driver;
	public ExtentTest test;
	public Loginpage(WebDriver driver,ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//header//a[@href='/account/login']")
	WebElement login;
	
	@FindBy(xpath="//input[@id='CustomerEmail']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='CustomerPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit'][1]")
	WebElement signinbutton;

	//web elements for create account 
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='CreatePassword']")
	WebElement newpassword;
	
	@FindBy(xpath="//a[@href='/account/register']")
	WebElement signupbutton;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement create;
	
	public WebElement Login_click()
	{
		return login;
	}
	
	public WebElement Email()
	{
		return emailid;
		
	}
	public WebElement Password()
	{
		return password;
		
	}
	
	public WebElement Sign_in()
	{
		return signinbutton;
		
	}

	
	//for create account page
	public WebElement create_click() {
		
		return signupbutton;
	}
	
		public WebElement fname() {
				
				return fname;
			}
		
		public WebElement lname() {
			
			return lname;
		}
		
		public WebElement cemail() {
			
			return email;
		}
		
		public WebElement cpassword() {
			
			return newpassword;
		}
		
		public WebElement create() {
			
			return create;
		}

}
