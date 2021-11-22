package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.*;
import utilities.BaseTest;

public class HomepageDefination extends BaseTest {
	
	public static Logger log= LogManager.getLogger(HomepageDefination.class.getName());
	@Given("^User lands on Home Page$")
	public void user_lands_on_home_page() {
		driver=setup();
		driver.get(baseURL);
	}

	@Then("^Validating title$")
	public void big_small_website_logo_should_be_displayed() {
		log.info("Homepage loaded successfully");
		//test.info("Homepage loaded successfully");
		Assert.assertEquals(driver.getTitle(),"Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts– Bigsmall.in");
		log.info("Homepage loaded successfully");
		//test.info("Homepage loaded successfully");
	}
}
