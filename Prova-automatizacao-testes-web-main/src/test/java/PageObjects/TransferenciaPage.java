package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Browser.JavaScriptExecutor;
import framework.Browser.Waits;

public class TransferenciaPage {
	private WebDriver driver;
	private Waits wait;
	private JavaScriptExecutor js = new JavaScriptExecutor();

	public TransferenciaPage(WebDriver driver) {
		this.driver = driver;
		wait = new Waits(this.driver);
	}

	public WebElement getVoltarButton() {
		return wait.visibilityOfElement(By.id("btnBack"));
	}

	public WebElement getSairButton() {
		return wait.visibilityOfElement(By.id("btnExit"));
	}

	public WebElement getTransferirButton() {
		return wait.visibilityOfElement(
				By.xpath("//form[@class='styles__ContainerFormTransfer-sc-1oow0wh-0 hehMDu']/button [@type='submit']"));
	}

	public WebElement getNumeroContaInput() {
		return wait.visibilityOfElement(By.xpath(
				"//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 gQAEIG input__child']/input[@type='accountNumber']"));
	}

	public WebElement getDigitoContaInput() {
		return wait.visibilityOfElement(By.xpath(
				"//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 gQAEIG input__child']/input[@type='digit']"));

	}

	public WebElement getValorTransferenciaInput() {
		return wait.visibilityOfElement(By.xpath(
				"//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 gQAEIG input__child']/input[@type='transferValue']"));

	}

	public WebElement getDescricaoInput() {
		return wait.visibilityOfElement(By.xpath(
				"//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 gQAEIG input__child']/input[@type='description']"));

	}

	// validacao
	public WebElement getValidaTexto() {
		WebElement webElement = wait.visibilityOfElement(By.xpath(
				"//div[@class='transfer__ContainerTexts-sc-1yjpf2r-3 isoOxX']/p[@class='transfer__TextInformation-sc-1yjpf2r-7 eUFZOb']"));
		js.highlight(driver, webElement);
		return webElement;
	}

	// alert
	public WebElement getTextoAlert() {
		WebElement webElement = wait.visibilityOfElement(By.id("modalText"));
		js.highlight(driver, webElement);
		return webElement;
	}

	// alert
	public WebElement getFecharButtonAlert() {
		return wait.visibilityOfElement(By.id("btnCloseModal"));
	}

}
