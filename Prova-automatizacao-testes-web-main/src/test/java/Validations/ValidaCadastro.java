package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.CadastroPage;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaCadastro {
	private WebDriver driver;
	private CadastroPage cadastroPage;

	public ValidaCadastro(WebDriver driver) {
		this.driver = driver;
		cadastroPage = new CadastroPage(this.driver);
	}

	// @SuppressWarnings("deprecation")
	public void validaCadastro() {
		try {
			String message = cadastroPage.getCriarContaComSaldoText().getText();
			Assertions.assertEquals("Criar conta com saldo ?", message);
			// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //mesmo assim
			// ele nao tira o print certo
			Report.log(Status.PASS, "Validação Cadastro com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Validação Cadastro ERRO!: " + e);
		}
	}

	public void validaCadastroEmailInputs() {
		try {
			String message = cadastroPage.getEmailInput().getText();
			Assertions.assertNotEquals(" ", message);
			Report.log(Status.PASS, "Email inserido com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Email nao inserido: " + e, Screenshot.captureBase64(driver));
		}
	}

	public void validaCadastroNomeInputs() {
		try {
			String message = cadastroPage.getNomeInput().getText();
			Assertions.assertNotEquals(" ", message);
			Report.log(Status.PASS, "Nome inserido com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Nome nao inserido: " + e, Screenshot.captureBase64(driver));
		}
	}

	public void validaCadastroSenhaInputs() {
		try {
			String message = cadastroPage.getSenhaInput().getText();
			Assertions.assertNotEquals(" ", message);
			Report.log(Status.PASS, "Senha inserido com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Senha nao inserido: " + e, Screenshot.captureBase64(driver));
		}
	}

	public void validaCadastroConfirmaSenhaInputs() {
		try {
			String message = cadastroPage.getConfirmaSenhaInput().getText();
			Assertions.assertNotEquals(" ", message);
			Report.log(Status.PASS, "Confirma Senha inserido com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Confirma Senha nao inserido: " + e, Screenshot.captureBase64(driver));
		}
	}

	public void validaCriarContaSaldoButton() {
		try {
			Assertions.assertTrue(cadastroPage.getCriarContaComSaldoAtivadoButton().isDisplayed());
			Report.log(Status.PASS, "Criação da conta com saldo ativada! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, ("Criação da conta com saldo ERRO!!: " + e), Screenshot.captureBase64(driver));
		}
	}

	public void validarContaCadastradaAlert() {
		try {
			Assertions.assertTrue(cadastroPage.getAlertTexto().isDisplayed());
			Report.log(Status.PASS, "Conta Criada com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, ("Erro ao criar a conta " + e), Screenshot.captureBase64(driver));
		}
	}

}
