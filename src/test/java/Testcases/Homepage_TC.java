package Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class Homepage_TC extends BaseTest
{
	public static Logger log= LogManager.getLogger(Homepage_TC.class.getName());
	@Test
	public void Homepage() throws InterruptedException
	{
		
		driver.get(baseURL);
		log.info("Homepage loaded successfully");
		test.info("Homepage loaded successfully");
		Assert.assertEquals(driver.getTitle(),"Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts– Bigsmall.in");
		log.info("Title validated succefully");
		test.info("Title validated succefully");
		
	}
	
}