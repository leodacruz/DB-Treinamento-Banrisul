package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import PageObject.HomePage;

public class LoginValidation {
	private WebDriver driver;
	private HomePage homePage;
	private Waits wait;

	public LoginValidation(WebDriver driver) {
		this.driver = driver;
		homePage = new HomePage(this.driver);
		this.wait = new Waits(this.driver);
	}

	public void validationLoginPage() {
		wait.loadElement(homePage.getTitle());
		Assertions.assertTrue(homePage.getTitle().isDisplayed());
	}
}
