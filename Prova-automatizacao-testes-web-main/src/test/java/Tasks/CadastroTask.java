package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CadastroPage;
import Validations.ValidaCadastro;
import Validations.ValidaLogin;
import framework.Utils.FakersGeneration;
import framework.Utils.FilesOperation;

public class CadastroTask {
	private WebDriver driver;

	private CadastroPage cadastroPage;

	private FakersGeneration faker;

	private ValidaLogin validaLogin;
	private ValidaCadastro validaCadastro;

	public CadastroTask(WebDriver driver) {
		this.driver = driver;
		cadastroPage = new CadastroPage(this.driver);
		faker = new FakersGeneration(this.driver);
		validaCadastro = new ValidaCadastro(driver);
		validaLogin = new ValidaLogin(this.driver);
	}

	// eh usado para a conta 1 e 2, caso add mais contas no contas.properties ele
	// aceita pois esta generico
	public void fazerCadastro(String conta) {

		// Criando Nome, Email e senha aleatorios e salvando no arquivo
		// contas.properties
		FilesOperation.setProperties("contas", conta + "nome", faker.getFirstName());
		FilesOperation.setProperties("contas", conta + "email", faker.getEmail());
		FilesOperation.setProperties("contas", conta + "senha", faker.getSenha());

		// Inserindo o Email
		cadastroPage.getEmailInput().sendKeys(FilesOperation.getProperties("contas").getProperty(conta + "email"));
		validaCadastro.validaCadastroEmailInputs();

		// Inserindo o Nome
		cadastroPage.getNomeInput().sendKeys(FilesOperation.getProperties("contas").getProperty(conta + "nome"));
		validaCadastro.validaCadastroNomeInputs();

		// Inserindo a Senha
		String senha = FilesOperation.getProperties("contas").getProperty(conta + "senha");
		cadastroPage.getSenhaInput().sendKeys(senha);
		cadastroPage.getVisibilidadeSenhaButton().click();
		validaCadastro.validaCadastroSenhaInputs();
		// Confirmando a Senha
		cadastroPage.getConfirmaSenhaInput().sendKeys(senha);
		cadastroPage.getVisibilidadeConfirmaSenhaButton().click();
		validaCadastro.validaCadastroConfirmaSenhaInputs();

		// Ativa conta saldo
		cadastroPage.getCriarContaComSaldoDesativadoButton().click();
		validaCadastro.validaCriarContaSaldoButton();

		// Confirma cadastro
		cadastroPage.getCadastrarButton().click();
		validaCadastro.validarContaCadastradaAlert();

		// PEGANDO O NUMERO DA CONTA
		String aux = cadastroPage.getAlertTexto().getText();
		FilesOperation.setProperties("contas", conta + "conta", aux.substring(8, 13));

		// Fecha o alert e valida que esta na LoginPage
		cadastroPage.getFecharButton().click();
		validaLogin.validaLogin();
	}
}
