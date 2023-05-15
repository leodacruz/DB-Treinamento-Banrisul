package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	
	
	private WebDriver driver;
	
	
	public CheckoutPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getFirstNameTextField() {
		
		return driver.findElement(By.id("first-name"));
		
	}
	
	public WebElement getLastNameTextField() {
		
		return driver.findElement(By.id("last-name"));
		
	}

	public WebElement getZipTextField() {
		
		return driver.findElement(By.id("postal-code"));
	}
	
	public WebElement getContinueButton() {
		
		return driver.findElement(By.id("continue"));
	}
	
	public WebElement getFinishButton() {
		
		return driver.findElement(By.id("finish"));
		
	}
	
}
