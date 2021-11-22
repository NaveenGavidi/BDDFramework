package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Wishlistpage {

public WebDriver driver;

public ExtentTest test;
	
	public Wishlistpage(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-product-id='6917229019334']")
	WebElement product;
	
	@FindBy(xpath="//span[contains(text(),'Add to Wishlist')]")
	WebElement Add_wishlist;
	
	@FindBy(xpath="//span[contains(text(),'wish list')]")
	WebElement wishlist;
	
	@FindBy(xpath="//button[@id='swym-welcome-button']")
	WebElement accessWishList;
	
	@FindBy(xpath="//a[@class='swym-link']")
	WebElement Product_visibility;
	
	public WebElement Product_click() {
		return product;
	}
	public WebElement Add_wishlist() {
		return Add_wishlist;
	}
	public WebElement Wishlist_click() {
		return wishlist;
	}
	public WebElement AcessTab_click() {
		return accessWishList;
	}

	public WebElement Product_visibility() {
		return Product_visibility;
	}
}
