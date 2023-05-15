package framework;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

import framework.Browser.DriverManager;
import framework.Browser.TypeBrowser;
import framework.Report.Report;
import framework.Utils.FilesOperation;

public class TestBase extends DriverManager {

	private static WebDriver driver;

	private static FilesOperation filesOperation = new FilesOperation();

	public static WebDriver getDriver() {

		driver = getDriver(TypeBrowser.CHROME);
		return driver;

	}

	@AfterEach
	public void finish() {

		Report.close();
		quitDriver();
	}

}
