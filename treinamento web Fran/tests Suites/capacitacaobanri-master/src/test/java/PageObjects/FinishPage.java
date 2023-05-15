package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class FinishPage {
	
	private WebDriver driver;
	private Waits wait;
	
	public FinishPage(WebDriver driver) {
		
		this.driver = driver;
		wait = new Waits(this.driver);
	
	}
	
	public WebElement getFinishTextLabel() {
		
		return driver.findElement(By.className("complete-header"));
		
	}
	
	public WebElement getMenuLogoutButton() {
		
		return driver.findElement(By.className("bm-burger-button"));
	}
	
	public WebElement getLogoutLink() {
		
		return wait.visibilityOfElement(By.id("logout_sidebar_link"));
	}

}
