package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.MenuPage;
import Validations.ValidaExtrato;
import Validations.ValidaLogin;
import Validations.ValidaTransferencia;

public class MenuTask {
	private WebDriver driver;
	private MenuPage menuPage;
	private ValidaLogin validaLogin;
	private ValidaExtrato validaExtrato;
	private ValidaTransferencia validaTransferencia;

	public MenuTask(WebDriver driver) {
		this.driver = driver;
		menuPage = new MenuPage(this.driver);
		validaLogin = new ValidaLogin(this.driver);
		validaExtrato = new ValidaExtrato(driver);
		validaTransferencia= new ValidaTransferencia(this.driver);
	}

	public void menuSair() {
		menuPage.getSairButton().click();
		validaLogin.validaLogin();
	}

	public void menuTransferencia() {
      menuPage.getTranferenciaButton().click();
      validaTransferencia.validaTransferencia();
	}

	public void menuExtrato() {
		menuPage.getExtratoButton().click();
		validaExtrato.validaExtrato();
	}

}
