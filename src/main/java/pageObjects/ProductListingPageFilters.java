package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Basepage;

public class ProductListingPageFilters extends Basepage {

	public ProductListingPageFilters() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public WebDriver driver;
	
	By allCategories=By.cssSelector("[data-drroot] .hide-fltrs:nth-of-type(1) .fltr-cntnr-ttl");
	By allCategoriesDropDownArrow=By.cssSelector("[data-drroot] .hide-fltrs:nth-of-type(1) .i-dropdown-arrow");
	By allCategoriesSearchBox=By.cssSelector("[data-title='Tüm Kategoriler'] [type]");
	By allCategoriesCheckBoxDress=By.cssSelector("[data-drroot] .hide-fltrs:nth-of-type(1) .ReactVirtualized__List [role] > div:nth-of-type(1) .fltr-item-wrppr");
	By brand=By.xpath("//div[@id='sticky-aggregations']/div[@class='aggrgtn-cntnr-wrppr']/div[2]/div[@class='fltr-cntnr-ttl-area']");
	By brandDropDownArrow=By.cssSelector("[data-drroot] .hide-fltrs:nth-of-type(2) .i-dropdown-arrow");
	By brandSearchBox=By.cssSelector("[placeholder='Marka ara']");
	By mangobrandCheckBox=By.cssSelector("div:nth-of-type(2) > .fltrs > div[role='grid'] > div[role='rowgroup'] > div:nth-of-type(1) > div > .fltr-item-wrppr");
	By size=By.cssSelector("[data-drroot] .hide-fltrs:nth-of-type(3) .fltr-cntnr-ttl");
	By sizeDropDownArrow=By.cssSelector("[data-drroot] .hide-fltrs:nth-of-type(3) .i-dropdown-arrow");
	By sizeSearchBox=By.cssSelector("[placeholder='Beden ara']");
	By sizeSmallCheckBox=By.cssSelector("[data-drroot] .hide-fltrs:nth-of-type(3) .fltrs div:nth-of-type(3) .chckbox");
	By sizeMediumCheckBox=By.cssSelector("[data-drroot] .hide-fltrs:nth-of-type(3) div:nth-of-type(4) .chckbox");
	
	public WebElement getAllCategories() throws IOException {
		this.driver=getDriver();
		return driver.findElement(allCategories);
	}
	public WebElement getAllCategoriesDropDownArrow() throws IOException {
		this.driver=getDriver();
		return driver.findElement(allCategoriesDropDownArrow);
	}
	public WebElement getAllCategoriesSearchBox() throws IOException {
		this.driver=getDriver();
		return driver.findElement(allCategoriesSearchBox);
	}
	public WebElement getAllCategoriesCheckBoxDress() throws IOException {
		this.driver=getDriver();
		return driver.findElement(allCategoriesCheckBoxDress);
	}
	public WebElement getBrand() throws IOException {
		this.driver=getDriver();
		return driver.findElement(brand);
	}
	public WebElement getBrandDownArrow() throws IOException {
		this.driver=getDriver();
		return driver.findElement(brandDropDownArrow);
	}
	public WebElement getBrandSearchBox() throws IOException {
		this.driver=getDriver();
		return driver.findElement(brandSearchBox);
	}
	public WebElement getMangoBrandCheckBox() throws IOException{
		this.driver=getDriver();
		return driver.findElement(mangobrandCheckBox);
	}
	public WebElement getSize() throws IOException {
		this.driver=getDriver();
		return driver.findElement(size);
	}
	public WebElement getSizeDropDownArrow() throws IOException {
		this.driver=getDriver();
		return driver.findElement(sizeDropDownArrow);
	}
	public WebElement getSizeSearchBox() throws IOException {
		this.driver=getDriver();
		return driver.findElement(sizeSearchBox);
	}
	public WebElement getSizeSmallCheckBox() throws IOException {
		this.driver=getDriver();
		return driver.findElement(sizeSmallCheckBox);
	}
	public WebElement getSizeMediumCheckBox() throws IOException {
		this.driver=getDriver();
		return driver.findElement(sizeMediumCheckBox);
	}
	
	public String getAllCategoriesCheckBoxDressActualTitle() {
		String allCategoriesCheckBoxDressActualTitle=driver.findElement(allCategoriesCheckBoxDress).getText();
		return allCategoriesCheckBoxDressActualTitle;
	}
	
	public String getAllCategoriesCheckBoxDressExpectedTitle() {
		String allCategoriesCheckBoxDressExpectedTitle="Elbise";
		return allCategoriesCheckBoxDressExpectedTitle;
	}
	
	public void allCategoriesCheckBoxAssertion(String allCategoriesCheckBoxDressActualTitle, String allCategoriesCheckBoxDressExpectedTitle) {
		
		allCategoriesCheckBoxDressActualTitle =driver.findElement(allCategoriesCheckBoxDress).getText();
		allCategoriesCheckBoxDressExpectedTitle="Elbise";
		try {
			Assert.assertEquals(allCategoriesCheckBoxDressActualTitle, allCategoriesCheckBoxDressExpectedTitle);
			System.out.println("Categories CheckBox text: "+ allCategoriesCheckBoxDressExpectedTitle);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String getBrandActualTitle() {
		String brandActualTitle=driver.findElement(mangobrandCheckBox).getText();
		return brandActualTitle;
	}
	
	public String getBrandExpectedTitle() {
		String brandExpectedTitle="MANGO";
		return brandExpectedTitle;
	}
		
	public void brandCheckBoxAssertion(String brandActualTitle, String brandExpectedTitle) {
		brandActualTitle=driver.findElement(mangobrandCheckBox).getText();
		brandExpectedTitle="MANGO";
		try {
			Assert.assertEquals(brandActualTitle, brandExpectedTitle);
			System.out.println("Brand CheckBox text: "+ brandExpectedTitle);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
