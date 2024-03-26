package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverInstance {

	public static ThreadLocal <WebDriver> driver=new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		if(driver.get()==null) {
			try {
				driver.set(createDriver());
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		return driver.get();
	}
	
	public static WebDriver createDriver() throws IOException {
		WebDriver driver=null;
		
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties");
		prop.load(file);
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("WebDriver.Chrome.Driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
			
			Map<String, Object> prefs=new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications",2);
			
			ChromeOptions option=new ChromeOptions();
			option.setExperimentalOption("prefs", prefs);
			
			driver=new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;
	}
	public static void cleanupDrive() {
		driver.get().quit();
		driver.remove();
	}
}
