package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.Basepage;

public class HomePage extends Basepage{

public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
public WebDriver driver;
	
	By cookieAccept=By.id("onetrust-accept-btn-handler");
	By searchBar=By.cssSelector(".V8wbcUhU");
	By searchBarSearchBtn=By.cssSelector(".cyrzo7gC");
	By signin=By.cssSelector(".account-user.link");
	By signout=By.cssSelector("a:nth-of-type(9) > p");
	By accountUserButton=By.cssSelector(".account-user.link > .link-text");
	By favorites=By.cssSelector(".account-favorites .link");
	By basket=By.cssSelector(".account-basket");
	By women=By.linkText("Kadın");
	By men=By.linkText("Erkek");
	By womanAndChild=By.linkText("Anne & Çocuk");
	By home=By.linkText("Ev & Yaşam");
	By supermarket=By.linkText("Süpermarket");
	By cosmetic=By.cssSelector("li:nth-of-type(6) > .category-header.navbar-first-cap");
	By shoesAndBags=By.linkText("Ayakkabı & Çanta");
	By electronic=By.cssSelector("li:nth-of-type(8) > .category-header.navbar-first-cap");
	By sporAndOutdoor=By.linkText("Spor&Outdoor");
	By bestseller=By.linkText("Çok Satanlar Yeni");
	By flashProducts=By.linkText("Flaş Ürünler Yeni");
	
	public WebElement getCookieAccept() throws IOException {
		this.driver=getDriver();
		return driver.findElement(cookieAccept);
	}
	public WebElement getSearchBar() throws IOException {
		this.driver=getDriver();
		return driver.findElement(searchBar);
	}
	public WebElement getSearchBarSearchBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(searchBarSearchBtn);
	}
	public WebElement getSignin() throws IOException {
		this.driver=getDriver();
		return driver.findElement(signin);
	}
	public WebElement getSignout() throws IOException {
		this.driver=getDriver();
		return driver.findElement(signout);
	}
	
	public WebElement getAccountUserButton() throws IOException {
		this.driver=getDriver();
		return driver.findElement(accountUserButton);
	}
	public WebElement getFavorites() throws IOException {
		this.driver=getDriver();
		return driver.findElement(favorites);
	}
	public WebElement getBasket() throws IOException {
		this.driver=getDriver();
		return driver.findElement(basket);
	}
	public WebElement getWomen() throws IOException {
		this.driver=getDriver();
		return driver.findElement(women);
	}
	public WebElement getMen() throws IOException {
		this.driver=getDriver();
		return driver.findElement(men);
	}
	public WebElement getWomanAndChild() throws IOException {
		this.driver=getDriver();
		return driver.findElement(womanAndChild);
	}
	public WebElement getHome() throws IOException {
		this.driver=getDriver();
		return driver.findElement(home);
	}
	public WebElement getSupermarket() throws IOException {
		this.driver=getDriver();
		return driver.findElement(supermarket);
	}
	public WebElement getCosmetic() throws IOException {
		this.driver=getDriver();
		return driver.findElement(cosmetic);
	}
	public WebElement getShoesAndBags() throws IOException {
		this.driver=getDriver();
		return driver.findElement(shoesAndBags);
	}
	public WebElement getElectronic() throws IOException {
		this.driver=getDriver();
		return driver.findElement(electronic);
	}
	public WebElement getSporAndOutdoor() throws IOException {
		this.driver=getDriver();
		return driver.findElement(sporAndOutdoor);
	}
	public WebElement getBestseller() throws IOException {
		this.driver=getDriver();
		return driver.findElement(bestseller);
	}
	public WebElement getFlashProducts() throws IOException {
		this.driver=getDriver();
		return driver.findElement(flashProducts);
	}
	
	public String getAccountUserButtonActual() {
		String accountUserButtonActual=driver.findElement(accountUserButton).getText();
		return accountUserButtonActual;
	}
	
	public String getAccountUserButtonExpected() {
		String accountUserButtonExpected="Hesabım";
		return accountUserButtonExpected;
	}
	
	public void accountUserButtonAssertion(String accountUserButtonActual, String accountUserButtonExpected) {
		accountUserButtonActual=driver.findElement(accountUserButton).getText();
		accountUserButtonExpected="Hesabım";
		try {
			Assert.assertEquals(accountUserButtonActual, accountUserButtonExpected);
			System.out.println("Account User Button: "+ accountUserButtonExpected);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
