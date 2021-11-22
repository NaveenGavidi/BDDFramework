package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageobjects.Wishlistpage;
import utilities.BaseTest;

public class wishlistDefination extends BaseTest{
	
	public static Logger log= LogManager.getLogger(wishlistDefination.class.getName());

@When("click on a product and click on add to cart")
public void click_on_a_product_and_click_on_add_to_cart() throws InterruptedException {
	Wishlistpage wp=new Wishlistpage(driver,test);
	Thread.sleep(2000);
	wp.Product_click().click();
	wp.Add_wishlist().click();
	log.info("Product added to wishlist");
	//test.info("Product added to wishlist");
}

@When("click on wishlist tab on the page")
public void click_on_wishlist_tab_on_the_page() throws InterruptedException {
	Wishlistpage wp=new Wishlistpage(driver,test);
	wp.Wishlist_click().click();
	Thread.sleep(2000);
	//test.info("Wishlist icon clicked successfully");
	wp.AcessTab_click().click();
	log.info("Wishlist page loaded successfully");
	//test.info("Wishlist page loaded successfully");
	
}

@Then("validate that the product is available in wishlist or not")
public void validate_that_the_product_is_available_in_wishlist_or_not() {
	Wishlistpage wp=new Wishlistpage(driver,test);
	Assert.assertTrue(wp.Product_visibility().isDisplayed());
	log.info("Wishlist page loaded and product visibility in wishlist verified");
	//test.info("Wishlist page loaded and product visibility in wishlist verified");
}


}
