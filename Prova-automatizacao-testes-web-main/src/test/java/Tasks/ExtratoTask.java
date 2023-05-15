package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.ExtratoPage;
import Validations.ValidaLogin;

public class ExtratoTask {
	private WebDriver driver;
	private ExtratoPage extratoPage;
	private ValidaLogin validaLogin;

	public ExtratoTask(WebDriver driver) {

		this.driver = driver;
		extratoPage = new ExtratoPage(this.driver);
		validaLogin = new ValidaLogin(this.driver);
	}
	
	
	public void sairDaConta() {
	extratoPage.getSairButton().click();
	validaLogin.validaLogin();
	}

}
