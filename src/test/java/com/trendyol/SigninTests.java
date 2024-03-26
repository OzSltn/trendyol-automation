package com.trendyol;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class SigninTests extends Hooks {

	public SigninTests() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void SigninTest() throws IOException, InterruptedException {
		//Creating an object of the website homepage
		HomePage home=new HomePage();
		
		//Creating an object of the website login page
		LoginPage login=new LoginPage();
		
		home.getCookieAccept().click();
		home.getSignin().click();
		login.getSigninButton().click();
		takeSnapShot("Picture one");
		
		//User details are loaded from Excel sheet
		FileInputStream fileLocation=new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\credential.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fileLocation);
		XSSFSheet sheet=workbook.getSheetAt(0);
			
		//Excel sheet row1
		XSSFRow row1=sheet.getRow(1);
		XSSFCell cellR1C0=row1.getCell(0);
		XSSFCell cellR1C1=row1.getCell(1);
		String emailRow1=cellR1C0.toString();
		String passwordRow1=cellR1C1.toString();
		
		//User details are printed to console from Excel sheet Row1
		System.out.println(emailRow1);
		System.out.println(passwordRow1);
		
		
		try {
			login.getEmail().sendKeys(emailRow1);
			login.getPassword().sendKeys(passwordRow1);
			login.getSigninButton().click();
			Thread.sleep(500);
			login.loginErrorBoxAssertion(login.getLoginErrorBoxActualTitle(), login.getLoginErorrBoxExpectedTitle());
			takeSnapShot("Picture two");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//Excel sheet row2
		XSSFRow row2=sheet.getRow(2);
		XSSFCell cellR2C0=row2.getCell(0);
		XSSFCell cellR2C1=row2.getCell(1);
		String emailRow2=cellR2C0.toString();
		String passwordRow2=cellR2C1.toString();
		
		//User details are printed to console from Excel sheet Row2
		System.out.println(emailRow2);
		System.out.println(passwordRow2);
		
		
		try {
			login.getEmail().clear();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			login.getEmail().sendKeys(emailRow2); 
			login.getPassword().clear();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			login.getPassword().sendKeys(passwordRow2);
			login.getSigninButton().click();
			login.loginErrorBoxAssertion(login.getLoginErrorBoxActualTitle(), login.getLoginErorrBoxExpectedTitle());
			Thread.sleep(500);
			takeSnapShot("Picture three");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		
		//Excel sheet row3
		XSSFRow row3=sheet.getRow(3);
		XSSFCell cellR3C0=row3.getCell(0);
		XSSFCell cellR3C1=row3.getCell(1);
		
		String emailRow3=cellR3C0.toString();
		String passwordRow3=cellR3C1.toString();
		
		//User details are printed to console from Excel sheet Row3
		System.out.println(emailRow3);
		System.out.println(passwordRow3);
		
		try {
			login.getEmail().clear();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			login.getEmail().sendKeys(emailRow3);
			login.getPassword().clear();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			login.getPassword().sendKeys(passwordRow3);
			login.getSigninButton().click();
			Thread.sleep(1000);
			takeSnapShot("Picture four");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//Creating an object of the Action class
		Actions action=new Actions(getDriver());
		action.moveToElement(home.getSignin());
		action.build().perform();
		home.getSignout().click();
		
	}

}
