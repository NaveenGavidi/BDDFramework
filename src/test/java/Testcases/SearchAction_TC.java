package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.SearchPage;
import utilities.BaseTest;

public class SearchAction_TC extends BaseTest{
	public static Logger log= LogManager.getLogger(SearchAction_TC.class.getName());
	
	@Test
	public void Search() throws IOException, InterruptedException{
		driver.get(baseURL);
		SearchPage sp=new SearchPage(driver,test);
		sp.product_enter().sendKeys("key chains",Keys.ENTER);
		log.info("Searching for the product");
		test.info("Searching for the product");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"key chains - Bigsmall.in");
		log.info("Searched product displayed successfully");
		test.pass("Searched product displayed successfully");
		
		
		
	}
}
