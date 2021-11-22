package stepDefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.java.en.When;
import pageobjects.newsletter;
import utilities.BaseTest;
import utilities.ReadConfig;

public class newsletterDefination extends BaseTest {
	public static Logger log= LogManager.getLogger(newsletterDefination.class.getName());
	ReadConfig readconfig=new ReadConfig();
	//Properties prop;
	public String excellocation=readconfig.Excel();

	
	@When("click on newsletter")
	public void click_on_sigin() throws InterruptedException {
		newsletter nl=new newsletter(driver,test);
		nl.email().click();
		Thread.sleep(1000);
	}

	@When("Enter the email and subscribe")
	public void enter_the_email_and_password_from_excel() throws IOException, InterruptedException {
		newsletter nl=new newsletter(driver,test);
		File scr1=new File(excellocation);
		FileInputStream fis1 = new FileInputStream(scr1);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis1);

		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rows = sheet.iterator();
		Row firstRow = rows.next();
		

		Iterator<Cell> ce1 = firstRow.cellIterator();
		ce1.next();
		String email = ce1.next().getStringCellValue();
		
		nl.email().sendKeys(email);
		log.info("Email entered successfully");
		//test.info("Email entered successfully");
		nl.subscribe().click();
		log.info("redirected to subscribe page");
		//test.pass("redirected to subscribe page");
	}

	

}
