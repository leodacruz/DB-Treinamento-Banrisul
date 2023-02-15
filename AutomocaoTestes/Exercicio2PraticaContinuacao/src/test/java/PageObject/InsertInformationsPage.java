package PageObject;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InsertInformationsPage {
	WebDriver driver;
	Waits wait;
	
	public InsertInformationsPage(WebDriver driver) {
		this.driver=driver;
		wait = new Waits(this.driver);
	}
	
	public WebElement getFisrtNameInsertTextFild() {
		return driver.findElement(By.id("first-name"));
	}
	public WebElement getLastNameInsertTextFild() {
		return driver.findElement(By.id("last-name"));
	}
	public WebElement getPostalCodeInsertTextFild() {
		return driver.findElement(By.id("postal-code"));
	}
	public WebElement getContinueButton() {
		return driver.findElement(By.id("continue"));
	}
	
}
