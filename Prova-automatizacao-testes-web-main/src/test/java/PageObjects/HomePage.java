package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTranferenciaButton() {
		return driver.findElement(By.id("btn-TRANSFERÊNCIA"));
	}

	public WebElement getExtratoButton() {
		return driver.findElement(By.id("btn-EXTRATO"));
	}

	public WebElement getSairButton() {
		return driver.findElement(By.id("btnExit"));
	}

	// validacao
	public WebElement getSaldoTexto() {
		return driver.findElement(By.id("textBalance"));
	}

	public WebElement getContaDigitalTexto() {
		return driver.findElement(By.id("textAccountNumber"));
	}

}
