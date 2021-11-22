package Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Wishlistpage;
import utilities.BaseTest;

public class Wishlistpage_TC extends BaseTest{
		
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
		@Test
		public void wishlist() throws InterruptedException
		{
			
			driver.get(baseURL);
			Wishlistpage wp=new Wishlistpage(driver,test);
			Thread.sleep(2000);
			wp.Product_click().click();
			wp.Add_wishlist().click();
			log.info("Product added to wishlist");
			test.info("Product added to wishlist");
			wp.Wishlist_click().click();
			Thread.sleep(2000);
			wp.AcessTab_click().click();
			log.info("Wishlist page loaded successfully");
			test.info("Wishlist page loaded successfully");
			Assert.assertTrue(wp.Product_visibility().isDisplayed());
			log.info("Wishlist page loaded and product visibility in wishlist verified");
			test.info("Wishlist page loaded and product visibility in wishlist verified");
		}
}
