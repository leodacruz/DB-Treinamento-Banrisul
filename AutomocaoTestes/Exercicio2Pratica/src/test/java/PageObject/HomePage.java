package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserNameInput() {
		/*
		 * 1 forma WebElement username = driver.findElement(By.id("user-name")); return
		 * username;
		 */
		// 2 forma(mais usavel)
		return driver.findElement(By.id("user-name"));
	}

	public WebElement getPasswordInput() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.id("login-button"));
	}
	
	public WebElement getTitle() {
		return driver.findElement(By.className("login_logo"));
	}

}
