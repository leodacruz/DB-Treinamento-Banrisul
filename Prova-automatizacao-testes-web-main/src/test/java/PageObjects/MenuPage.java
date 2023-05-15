package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Browser.JavaScriptExecutor;
import framework.Browser.Waits;

public class MenuPage {
	private WebDriver driver;
	private Waits wait;
	private JavaScriptExecutor js = new JavaScriptExecutor();

	public MenuPage(WebDriver driver) {
		this.driver = driver;
		wait = new Waits(this.driver);
	}

	public WebElement getTranferenciaButton() {
		return wait.visibilityOfElement(By.id("btn-TRANSFERÊNCIA"));
	}

	public WebElement getExtratoButton() {
		return wait.visibilityOfElement(By.id("btn-EXTRATO"));
	}

	public WebElement getSairButton() {
		return wait.visibilityOfElement(By.id("btnExit"));
	}

	// validacao
	public WebElement getValidaTexto() {
		WebElement webElement = wait.visibilityOfElement(By.id("textName"));
		js.highlight(driver, webElement);
		return webElement;
	}

	public WebElement getContaDigitalTexto() {
		return wait.visibilityOfElement(By.id("textAccountNumber"));
	}

}
