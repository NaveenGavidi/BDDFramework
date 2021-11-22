package Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Contactpage;
import utilities.BaseTest;

public class Contactpage_TC extends BaseTest{
	public static Logger log= LogManager.getLogger(Contactpage_TC.class.getName());
	@Test
	public void ContactPage() throws InterruptedException
	{
		
		driver.get(baseURL);
		Contactpage cp=new Contactpage(driver,test);
		cp.Contact_us().click();
		log.info("contact page loaded successfully");
		test.info("contact page loaded successfully");
		cp.Name().sendKeys("DemoOne");
		cp.EmailID().sendKeys("demo123@gmail.com");
		cp.MessageBox().sendKeys("need some extra features");
		test.info("details entered successfully");
		cp.Send().click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("message sent successfully");
		test.info("message sent successfully");
	}
}
