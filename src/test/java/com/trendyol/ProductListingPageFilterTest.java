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
import pageObjects.ProductListingPageFilters;

public class ProductListingPageFilterTest extends Hooks {

	public ProductListingPageFilterTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void TestOne() throws IOException, InterruptedException {
		
		//Creating an object of the website filters
		HomePage home=new HomePage();
		
		//If you want to run the tests separately, the code on the bottom line must be activated
		//home.getCookieAccept().click();
		
		home.getSignin().click();
		
		//Creating an object of the website Login Page
		LoginPage login=new LoginPage();
		
		//User details are loaded from Excel sheet
		FileInputStream workbookLocation=new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\credential.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(workbookLocation);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row3=sheet.getRow(3);
		XSSFCell cellR3C0=row3.getCell(0);
		XSSFCell cellR3C1=row3.getCell(1);
		String emailRow3=cellR3C0.toString();
		String passwordRow3=cellR3C1.toString();
		
		System.out.println(emailRow3);
		System.out.println(passwordRow3);
		
		try {
			login.getEmail().sendKeys(emailRow3);
			login.getPassword().sendKeys(passwordRow3);
			login.getSigninButton().click();
			Thread.sleep(1500);
			home.accountUserButtonAssertion(home.getAccountUserButtonActual(), home.getAccountUserButtonExpected());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		Thread.sleep(1500);
		takeSnapShot("Picture five");
		
		
		home.getSearchBar().sendKeys("Mango elbise");
		home.getSearchBarSearchBtn().click();
		
		//Creating an object of the website filters
		ProductListingPageFilters filters=new ProductListingPageFilters();
		filters.getAllCategories().click();
		filters.getAllCategoriesDropDownArrow().click();
		filters.getAllCategoriesSearchBox().sendKeys("Elbise");
				
		//Waited to dress check box to be clickable
		waitForElementClickable(filters.getAllCategoriesCheckBoxDress(), Duration.ofSeconds(10));
		filters.getAllCategoriesCheckBoxDress().click();
				
		//Assertion for dress title (dress actual title equals to dress expected title)
		filters.allCategoriesCheckBoxAssertion(filters.getAllCategoriesCheckBoxDressActualTitle(), filters.getAllCategoriesCheckBoxDressExpectedTitle());
		Thread.sleep(1500);
		takeSnapShot("Picture six");
		
		
		waitForElementClickable(filters.getBrand(), Duration.ofSeconds(10));
		filters.getBrand().click();
		filters.getBrandDownArrow().click();
		filters.getBrandSearchBox().sendKeys("Mango");
		
		//Waited to Mango Brand Check box to be clickable
		waitForElementClickable(filters.getMangoBrandCheckBox(), Duration.ofSeconds(10));
		filters.getMangoBrandCheckBox().click();
				
		//Assertion for brand title (brand actual title equals to brand expected title)
		filters.brandCheckBoxAssertion(filters.getBrandActualTitle(), filters.getBrandExpectedTitle());
		Thread.sleep(500);
		takeSnapShot("Picture seven");
		
		//Creating an object of the Action class
		Actions action=new Actions(getDriver());
		action.moveToElement(home.getSignin());
		action.build().perform();
		home.getSignout().click();
	}
	
	

}
