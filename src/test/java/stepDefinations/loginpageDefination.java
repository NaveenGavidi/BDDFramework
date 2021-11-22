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
import pageobjects.Loginpage;
import utilities.BaseTest;
import utilities.ReadConfig;

public class loginpageDefination extends BaseTest {
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	ReadConfig readconfig=new ReadConfig();
	//Properties prop;
	public String excellocation=readconfig.Excel();

	
	@When("click on sigin")
	public void click_on_sigin() throws InterruptedException {
		Loginpage lp=new Loginpage(driver,test);
		lp.Login_click().click();
		log.info("Login Page loaded successfully");
		//test.info("Login Page loaded successfully");
		Thread.sleep(3000);
	}

	@When("Enter the email and password from excel")
	public void enter_the_email_and_password_from_excel() throws IOException, InterruptedException {
		Loginpage lp=new Loginpage(driver,test);
		File scr1=new File(excellocation);
		FileInputStream fis1 = new FileInputStream(scr1);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis1);

		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rows = sheet.iterator();
		Row firstRow = rows.next();
		Row secondRow = rows.next();

		Iterator<Cell> ce1 = firstRow.cellIterator();
		ce1.next();
		String email = ce1.next().getStringCellValue();
		Iterator<Cell> ce2 = secondRow.cellIterator();
		ce2.next();
		String password = ce2.next().getStringCellValue();
		lp.Email().sendKeys(email);
		log.info("Email entered successfully");
		//test.info("Email entered successfully");
		lp.Password().sendKeys(password);
		log.info("password entered successfully");
		//test.info("password entered successfully");
		lp.Sign_in().click();
		log.info("user details verified successfully");
		//test.pass("user details verified successfully");
		Thread.sleep(2000);
	}

	

}
