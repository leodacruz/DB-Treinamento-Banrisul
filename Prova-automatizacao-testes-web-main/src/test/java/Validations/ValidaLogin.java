package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.LoginPage;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaLogin {
	private WebDriver driver;
	private LoginPage home;

	public ValidaLogin(WebDriver driver) {
		this.driver = driver;
		home = new LoginPage(this.driver);
	}

	public void validaLogin() {
		try {
			Assertions.assertTrue(home.getValidaTexto().isDisplayed());
			Report.log(Status.PASS, "Validação login com sucesso! " ,Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Validação login ERRO!: " + e);
		}
	}
	
	public void validaLoginEmail() {
		try {
			String message = home.getEmailInput().getText();
			Assertions.assertNotEquals(" ", message);
			Report.log(Status.PASS, "Validação Email com sucesso! " ,Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Validação Email ERRO!: " + e);
		}
	}
	
	public void validaLoginSenha() {
		try {
			String message = home.getSenhalInput().getText();
			Assertions.assertNotEquals(" ", message);
			Report.log(Status.PASS, "Validação Senha com sucesso! " ,Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Validação Senha ERRO!: " + e);
		}
	}
}
