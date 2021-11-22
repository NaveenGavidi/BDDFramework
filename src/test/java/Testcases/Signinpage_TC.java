package Testcases;

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
import org.testng.annotations.Test;

import pageobjects.Loginpage;
import utilities.BaseTest;
import utilities.ReadConfig;

public class Signinpage_TC extends BaseTest{
	ReadConfig readconfig=new ReadConfig();
	//Properties prop;
	public String excellocation=readconfig.Excel();

	public static Logger log= LogManager.getLogger(Signinpage_TC.class.getName());
	@Test
	public void Loginpage() throws IOException, InterruptedException
	{	
		
		driver.get(baseURL);
		Loginpage lp=new Loginpage(driver,test);
		lp.Login_click().click();
		log.info("Login Page loaded successfully");
		test.info("Login Page loaded successfully");
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
		test.info("First name entered successfully");
		lp.lname().sendKeys(lname);
		log.info("Last name entered successfully");
		test.info("Last name entered successfully");
		lp.cemail().sendKeys(email);
		log.info("Email entered successfully");
		test.info("Email entered successfully");
		lp.cpassword().sendKeys(password);
		log.info("password entered successfully");
		test.pass("password entered successfully");
		lp.create().click();
		log.info("user registerd to login verification");
		test.pass("user registerd to login verification");
	}
}

