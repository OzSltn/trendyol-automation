package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
	
	private static final java.util.Date Date = null;
	private String url;
	private Properties prop;
	
	public Basepage() throws IOException {
		
		prop=new Properties();
		FileInputStream file=new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\resources\\config.properties");
		prop.load(file);
	}
	
	public static WebDriver getDriver() throws IOException {	
		return WebDriverInstance.getDriver();
	}
	
	public String getUrl() throws IOException {
		url=prop.getProperty("url");
		return url;
	}
	
	public void takeSnapShot(String name) throws IOException {
		File srcFile=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File destFile=new File( System.getProperty("user.dir")+ "\\target\\screenshots\\" + timeStamp() + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
	
	public static String timeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new java.util.Date());
	}
	

	public static void waitForElementClickable(WebElement element, Duration time) throws IOException {
		WebDriverWait wait=new WebDriverWait(getDriver(), time);
		wait.until(ExpectedConditions.elementToBeClickable(element));		
	}
	
}
