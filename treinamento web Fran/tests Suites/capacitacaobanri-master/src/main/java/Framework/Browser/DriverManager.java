package Framework.Browser;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static WebDriver driver;
	
	private static WebDriver getManagerDriver(TypeBrowser type) {
		
		switch(type) {
		
		case CHROME:
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
			break;
			
		case FIREFOX:
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		
		case EDGE:
			
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("--start-maximized");
			driver = new EdgeDriver(edgeOptions);
			break;
		
		case HEADLESS:
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("--window-size(1366,768)");
			driver = new ChromeDriver(chromeOptions);
			break;
		
		case IE:
			
			WebDriverManager.iedriver().setup();
			MutableCapabilities capabilities = new MutableCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, Browser.IE);
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver();
			break;
		}

      return driver;
	}
	
	
	public static WebDriver getDriver(TypeBrowser type) {
		
		if(driver == null) {
			
			driver = getManagerDriver(type);
			
		}
		
		return driver;
		
	}
	
	public static void quitDriver() {
		
		
		if(driver !=null) {
			
			driver.quit();
			driver = null;
			
		}
		
	}
	
	
	
}
