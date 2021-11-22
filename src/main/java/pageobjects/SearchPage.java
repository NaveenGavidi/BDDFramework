package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class SearchPage {

	public WebDriver driver;
	public ExtentTest test;
	public SearchPage(WebDriver driver,ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//header//div//form//input[@type='search']")
	WebElement product_name;
	
	@FindBy(xpath="//header//div//form//img[@class='st-search-icon']")
	WebElement clickfind;
	
	
	
	
	
	public WebElement product_enter()
	{
		return product_name;
	}
	public WebElement Find_click()
	{
		return clickfind;
	}

	
	
}
