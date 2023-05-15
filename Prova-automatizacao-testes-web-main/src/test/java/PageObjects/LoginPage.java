package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Browser.JavaScriptExecutor;
import framework.Browser.Waits;

public class LoginPage {
	private WebDriver driver;
	private Waits wait;
	private JavaScriptExecutor js = new JavaScriptExecutor();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new Waits(this.driver);
	}

	public WebElement getEmailInput() {
		return wait.visibilityOfElement(By.xpath("//div[@class ='card__login']/form/div/input[@type='email']"));
	}

	public WebElement getSenhalInput() {
		return wait.visibilityOfElement(By.cssSelector(
				"#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__password > div > input"));
	}

	public WebElement getVisibilidadadeSenhaButton() {
		return wait.visibilityOfElement(By.xpath("//div[@class ='login__password']/button[@class='login__eye']"));
	}

	public WebElement getAcessarButton() {
		return wait.visibilityOfElement(By.xpath(
				"//div[@class='login__buttons']/button[@class='style__ContainerButton-sc-1wsixal-0 otUnI button__child']"));
	}

	public WebElement getRegistrarButton() {
		return wait.visibilityOfElement(By.xpath(
				"//div[@class='login__buttons']/button[@class='style__ContainerButton-sc-1wsixal-0 ihdmxA button__child']"));
	}

	// Validação
	public WebElement getValidaTexto() {
		WebElement webElement = wait.visibilityOfElement(
				By.xpath("//div[@class='login__link']/p[@class='styles__WarnigWrapper-sc-1ota0lw-0 kpiCJH']"));
		js.highlight(driver, webElement);
		return webElement;
	}

}
