package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Basepage;

public class LoginPage extends Basepage {

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
public WebDriver driver;
	
	By email=By.cssSelector("input#login-email");
	By password=By.cssSelector("input#login-password-input");
	By signinButton=By.cssSelector("form > .q-button.q-button-medium.q-fluid.q-primary.submit");
	By forgotPassword=By.cssSelector(".forgot-password span");
	By signinWithFacebook=By.cssSelector(".social-account-login-buttons [class='q-layout social-login-button flex flex-1']:nth-of-type(1)");
	By signinWithGoogle=By.cssSelector(".social-account-login-buttons [class='q-layout social-login-button flex flex-1']:nth-of-type(2)");
	By createNewAccount=By.cssSelector("[aria-pressed='false']");
	By orderTrackingWithoutMembership=By.cssSelector(".clickable-text");
	By loginErrorBox=By.cssSelector("div#error-box-wrapper");

	public WebElement getEmail() throws IOException {
		this.driver=getDriver();
		return driver.findElement(email);	
	}
	public WebElement getPassword() throws IOException {
		this.driver=getDriver();
		return driver.findElement(password);	
	}
	public WebElement getSigninButton() throws IOException {
		this.driver=getDriver();
		return driver.findElement(signinButton);	
	}
	public WebElement getForgotPassword() throws IOException {
		this.driver=getDriver();
		return driver.findElement(forgotPassword);	
	}
	public WebElement getSigninWithGoogle() throws IOException {
		this.driver=getDriver();
		return driver.findElement(signinWithGoogle);	
	}
	public WebElement getSigninWithFacebook() throws IOException {
		this.driver=getDriver();
		return driver.findElement(signinWithFacebook);	
	}
	public WebElement getCreateNewAccount() throws IOException {
		this.driver=getDriver();
		return driver.findElement(createNewAccount);
	}
	public WebElement getOrderTrackingWithoutMembership() throws IOException {
		this.driver=getDriver();
		return driver.findElement(orderTrackingWithoutMembership);
	}
	public WebElement getloginErrorBox() throws IOException {
		this.driver=getDriver();
		return driver.findElement(loginErrorBox);	
	}
	
	public String getLoginErrorBoxActualTitle() {
		String loginErrorBoxActualTitle=driver.findElement(loginErrorBox).getText();
		return loginErrorBoxActualTitle;
	}
	
	public String getLoginErorrBoxExpectedTitle() {
		String loginErorrBoxExpectedTitle="E-posta adresiniz ve/veya şifreniz hatalı.";
		return loginErorrBoxExpectedTitle;
	}
		
	public void loginErrorBoxAssertion(String loginErrorBoxActualTitle, String loginErorrBoxExpectedTitle) {
		loginErrorBoxActualTitle=driver.findElement(loginErrorBox).getText();
		loginErorrBoxExpectedTitle="E-posta adresiniz ve/veya şifreniz hatalı.";
		try {
			Assert.assertEquals(loginErrorBoxActualTitle, loginErorrBoxExpectedTitle);
			System.out.println("Login Error CheckBox text: "+ loginErorrBoxExpectedTitle);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
