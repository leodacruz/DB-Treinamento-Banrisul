package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import PageObjects.FinishPage;
import Validations.FinishValidation;
import Validations.LoginValidation;

public class FinishTask {
	
	private WebDriver driver;
	private FinishPage finishPage;
	private Waits wait;
	private LoginValidation loginValidation;
	private FinishValidation finishValidation;
	
	public FinishTask(WebDriver driver) {
		
		this.driver = driver;
		finishPage = new FinishPage(this.driver);
		wait = new Waits(this.driver);
		loginValidation = new LoginValidation(this.driver);
		finishValidation = new FinishValidation(this.driver);
	}
	
	public void finalizarCompra() {
		
		finishValidation.validationMessageCompra();
		finishPage.getMenuLogoutButton().click();
		wait.loadElement(finishPage.getLogoutLink());
		finishPage.getLogoutLink().click();
		loginValidation.validationLoginPage();
	
	}

}
