package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.TransferenciaPage;
import Validations.ValidaLogin;
import Validations.ValidaMenu;
import Validations.ValidaTransferencia;
import framework.Utils.FilesOperation;

public class TransferenciaTask {
	WebDriver driver;
	TransferenciaPage transferenciaPage;
	private ValidaLogin validaLogin;
	private ValidaTransferencia validaTransferencia;
	private ValidaMenu validaMenu;

	public TransferenciaTask(WebDriver driver) {
		this.driver = driver;
		transferenciaPage = new TransferenciaPage(this.driver);
		validaLogin = new ValidaLogin(this.driver);
		validaTransferencia = new ValidaTransferencia(this.driver);
		validaMenu = new ValidaMenu(this.driver);
	}

	public void sairDaConta() {
		transferenciaPage.getSairButton().click();
		validaLogin.validaLogin();
	}

	public void fazerTransferencia(String conta2) {
		String conta = FilesOperation.getProperties("contas").getProperty(conta2 + "conta");
		transferenciaPage.getNumeroContaInput().sendKeys(conta.substring(0, 3));
		validaTransferencia.validaNumeroContaInputs();
		transferenciaPage.getDigitoContaInput().sendKeys(conta.substring(4));
		validaTransferencia.validaDigitoContaInputs();
		transferenciaPage.getValorTransferenciaInput().sendKeys("200");
		validaTransferencia.validaTransferencia();
		transferenciaPage.getDescricaoInput().sendKeys("Transferencia de 200 para Conta2");
		validaTransferencia.validaDescricaoInputs();
		transferenciaPage.getTransferirButton().click();
		validaTransferencia.validaTransferenciaAlert();
		transferenciaPage.getFecharButtonAlert().click();
		transferenciaPage.getVoltarButton().click();
		validaMenu.validaMenu();	
	}

}
