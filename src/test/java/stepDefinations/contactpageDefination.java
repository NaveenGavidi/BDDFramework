package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.aventstack.extentreports.model.Report;

import io.cucumber.java.en.*;
import pageobjects.Contactpage;
import utilities.BaseTest;
import utilities.*;

	

public class contactpageDefination extends BaseTest{
	public static Logger log= LogManager.getLogger(contactpageDefination.class.getName());
	ExtentReporterNG report=new ExtentReporterNG();
	@When("click contact us tab in footer")
	public void click_contact_us_tab_in_footer() {
		
		Contactpage cp=new Contactpage(driver,test);
		cp.Contact_us().click();
		log.info("contact page loaded successfully");
		//test.info("contact page loaded successfully");
	}

	 @And("^Enter the name \"([^\"]*)\" email \"([^\"]*)\" and message \"([^\"]*)\" and click on send$")
	    public void enter_the_name_something_email_something_and_message_something_and_click_on_send(String name, String email, String message) throws Throwable {
		Contactpage cp=new Contactpage(driver,test);
		cp.Name().sendKeys(name);
		cp.EmailID().sendKeys(email);
		cp.MessageBox().sendKeys(message);
		//test.info("details entered successfully");
		cp.Send().click();
		Thread.sleep(2000);
	}

	@Then("Thankyou message displayed")
	public void thankyou_message_displayed() {
		Contactpage cp=new Contactpage(driver,test);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("message sent successfully");
		//test.info("message sent successfully");
	}
}
