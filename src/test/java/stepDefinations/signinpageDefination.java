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

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.Loginpage;
import utilities.BaseTest;
import utilities.ReadConfig;

public class signinpageDefination extends BaseTest {
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	ReadConfig readconfig=new ReadConfig();
	//Properties prop;
	public String excellocation=readconfig.Excel();

	

	
	@And("click on create account")
	public void click_on_sigup() throws InterruptedException {
		Loginpage lp=new Loginpage(driver,test);
		lp.create_click().click();
		log.info("Create account Page loaded successfully");
		//test.info("Create account loaded successfully");
		Thread.sleep(2000);
	}

	@Then("Enter the required values")
	public void enter_the_required_fields_from_excel() throws IOException, InterruptedException {
		Loginpage lp=new Loginpage(driver,test);
		File scr1=new File(excellocation);
		FileInputStream fis1 = new FileInputStream(scr1);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis1);

		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rows = sheet.iterator();
		Row firstRow = rows.next();
		Row secondRow = rows.next();
		Row thirdRow = rows.next();
		Row fourthRow = rows.next();

		Iterator<Cell> ce1 = firstRow.cellIterator();
		ce1.next();
		String email = ce1.next().getStringCellValue();
		Iterator<Cell> ce2 = secondRow.cellIterator();
		ce2.next();
		String password = ce2.next().getStringCellValue();
		Iterator<Cell> ce3 = thirdRow.cellIterator();
		ce1.next();
		String fname = ce3.next().getStringCellValue();
		Iterator<Cell> ce4 = fourthRow.cellIterator();
		ce2.next();
		String lname = ce4.next().getStringCellValue();
		lp.fname().sendKeys(fname);
		log.info("First name entered successfully");
		//test.info("First name entered successfully");
		lp.lname().sendKeys(lname);
		log.info("Last name entered successfully");
		//test.info("Last name entered successfully");
		lp.cemail().sendKeys(email);
		log.info("Email entered successfully");
		//test.info("Email entered successfully");
		lp.cpassword().sendKeys(password);
		log.info("password entered successfully");
		//test.pass("password entered successfully");
		
	}
	
	@And("click on create")
	public void click_on_create() throws IOException, InterruptedException {
		Loginpage lp=new Loginpage(driver,test);
		lp.create().click();
		log.info("user details verified successfully");
		//test.pass("user details verified successfully");
	}

	

}
