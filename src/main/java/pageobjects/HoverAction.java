package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class HoverAction {

public WebDriver driver;
public ExtentTest test;
	public HoverAction(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@data-dropdown-rel='shop-by-category']")
	WebElement hoverelement;
	
	@FindBy(xpath="//*[@id=\'myheader\']/div[1]/div/div/ul/li[10]/ul/li[4]/a")
	WebElement selectItem;
	
	@FindBy(xpath="//h1[contains(text(),'Keychains')]")
	WebElement subpage_visiblity;
	
	public WebElement Hover_select() {
		return hoverelement;
	}

	public WebElement Select_Item() {
		return selectItem;
	}
	
	public WebElement Page_Loaded() {
		return subpage_visiblity;
	}
	
}
