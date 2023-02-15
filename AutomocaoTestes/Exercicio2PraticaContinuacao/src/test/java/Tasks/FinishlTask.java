package Tasks;

import org.openqa.selenium.WebDriver;


import PageObject.FinishPage;
import Validations.FinishValidation;
import Validations.LoginValidation;

public class FinishlTask {

	private WebDriver driver;
	private FinishPage finalPage;
	private LoginValidation loginValidation;
	private FinishValidation finalValidation;

	public FinishlTask(WebDriver driver) {
		this.driver = driver;
		finalPage = new FinishPage(this.driver);
		this.loginValidation = new LoginValidation(this.driver);
		finalValidation = new FinishValidation(this.driver);
	}

	public void finalTela()  {
		finalValidation.validationFinalPage(); // valida pelo logo gigante
		finalPage.getSanduicheButton().click();
		finalPage.getLogoutButton().click();
		loginValidation.validationLoginPage();
	}
}
