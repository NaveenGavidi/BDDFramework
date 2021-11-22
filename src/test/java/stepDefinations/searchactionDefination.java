package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageobjects.SearchPage;
import utilities.BaseTest;

public class searchactionDefination extends BaseTest{
	
	public static Logger log= LogManager.getLogger(searchactionDefination.class.getName());
	
	
	 @When("^user enter a product name \"([^\"]*)\" and click on search$")
	    public void user_enter_a_product_name_something_and_click_on_search(String product) throws Throwable {
		 SearchPage sp=new SearchPage(driver,test);
		 sp.product_enter().sendKeys(product,Keys.ENTER);
			log.info("Searching for the product");
			//test.info("Searching for the product");
			Thread.sleep(2000);
	 }
	@Then("result page title is verified")
	public void search_title() {
		
		Assert.assertEquals(driver.getTitle(),"key chains - Bigsmall.in");
		log.info("Searched product displayed successfully");
		//test.pass("Searched product displayed successfully");
	}

}
