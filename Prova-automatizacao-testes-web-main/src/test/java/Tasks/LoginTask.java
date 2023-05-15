package Tasks;


import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import Validations.ValidaCadastro;
import Validations.ValidaLogin;
import Validations.ValidaMenu;
import framework.Utils.FilesOperation;
import PageObjects.CadastroPage;

public class LoginTask {
	private WebDriver driver;
	private LoginPage homePage;
	private ValidaLogin validaLogin;
	private ValidaCadastro validaCadastro;
	private ValidaMenu validaMenu;
        private CadastroPage cadastroPage;
	
	public LoginTask(WebDriver driver) {
		this.driver = driver;
		homePage = new LoginPage(this.driver);
		validaLogin = new ValidaLogin(this.driver);
		validaCadastro= new ValidaCadastro(this.driver);
		validaMenu = new ValidaMenu(this.driver);
		cadastroPage= new CadastroPage(this.driver);
	}

	public void acessarCadastro() {
		validaLogin.validaLogin();
		homePage.getRegistrarButton().click();
		cadastroPage.getEmailInput().click();//gambiarra para tirar o print certo
		validaCadastro.validaCadastro();
	}

	public void fazerLogin(String conta) {
		homePage.getEmailInput().sendKeys(FilesOperation.getProperties("contas").getProperty(conta+"email"));
		validaLogin.validaLoginEmail();
		homePage.getSenhalInput().sendKeys(FilesOperation.getProperties("contas").getProperty(conta+"senha"));
		homePage.getVisibilidadadeSenhaButton().click();
		validaLogin.validaLoginSenha();
		homePage.getAcessarButton().click();
		validaMenu.validaMenu();
	}

}
