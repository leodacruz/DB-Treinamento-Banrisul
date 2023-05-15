package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Browser.JavaScriptExecutor;
import framework.Browser.Waits;

public class ExtratoPage {
	private WebDriver driver;
	private Waits wait;
	private JavaScriptExecutor js = new JavaScriptExecutor();

	public ExtratoPage(WebDriver driver) {
		this.driver = driver;
		wait = new Waits(this.driver);

	}

	public WebElement getVoltarButton() {
		return wait.visibilityOfElement(By.id("btnBack"));
	}

	public WebElement getSairButton() {
		return wait.visibilityOfElement(By.id("btnExit"));

	}

//validacao
	public WebElement getSaldoDisponivelTexto() {
		WebElement webElement = wait.visibilityOfElement(By.xpath(
				"//div[@class='bank-statement__ContainerBalance-sc-7n8vh8-9 dntobx']/p[@class='bank-statement__LabelText-sc-7n8vh8-10 UPwdn']"));
		js.highlight(driver, webElement);
		return webElement;
	}
}
