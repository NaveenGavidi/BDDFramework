package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageobjects.HoverAction;
import utilities.BaseTest;

public class hoveractionDefination extends BaseTest{
	
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	
	@When("moved to select by category section")
	public void moved_to_category_section() throws InterruptedException {
		HoverAction ha=new HoverAction(driver,test);
		Actions a=new Actions(driver);
		WebElement move=ha.Hover_select();
		a.moveToElement(move).build().perform();
		log.info("Hover performed successfully");
		//test.info("Hover performed successfully");
		
	}

	@When("select birthday gift for kids")
	public void select_birthday_gift_for_kids() throws InterruptedException {
		HoverAction ha=new HoverAction(driver,test);
		ha.Select_Item().click();
		Thread.sleep(3000);
		//test.info("Element selected from the Hover tab");
	}

	@Then("validate that the desired page is opened or not")
	public void validate_that_the_desired_page_is_opened_or_not() {
		HoverAction ha=new HoverAction(driver,test);
		Assert.assertTrue(ha.Page_Loaded().isDisplayed());
		log.info("desired page loaded successfully");
		//test.info("desired page loaded successfully");
	}

}
