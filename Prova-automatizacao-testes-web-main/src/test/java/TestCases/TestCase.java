package TestCases;


import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.ExtratoPage;
import Tasks.CadastroTask;
import Tasks.ExtratoTask;
import Tasks.LoginTask;
import Tasks.MenuTask;
import Tasks.TransferenciaTask;
import framework.TestBase;
import framework.Report.Report;
import framework.Report.ReportType;
import framework.Report.Screenshot;
import framework.Utils.FilesOperation;

public class TestCase extends TestBase {

	private WebDriver driver = this.getDriver();

	private String Properties = "url";
	private LoginTask loginTask = new LoginTask(this.driver);
	private CadastroTask cadastroTask = new CadastroTask(this.driver);
	private MenuTask menuTask = new MenuTask(this.driver);
	private ExtratoTask extratoTask = new ExtratoTask(this.driver);
	private TransferenciaTask transferenciaTask= new TransferenciaTask(this.driver);

	@BeforeEach
	public void initialTest() throws IOException {
		getDriver().get(FilesOperation.getProperties(Properties).getProperty("urlProva"));
	}

	@Test
	public void validarFrames() {

		try {
			
			Report.createTest("Criação da Primeira Conta", ReportType.GROUP);
			Report.createStep("Acessar Cadastro");
			loginTask.acessarCadastro();
			Report.createStep("Cadastro da conta");
			cadastroTask.fazerCadastro("conta1");
			Report.createStep("Validar a conta");
			loginTask.fazerLogin("conta1");
			menuTask.menuSair();
			
			Report.createTest("Criação da Segunda Conta", ReportType.GROUP);
			Report.createStep("Acessar Cadastro");
			loginTask.acessarCadastro();
			Report.createStep("Cadastro da conta");
			cadastroTask.fazerCadastro("conta2");
			Report.createStep("Validar a conta");
			loginTask.fazerLogin("conta2");
			menuTask.menuSair();
			
			Report.createTest("Consultar Extrato das  Conta1 e Conta2", ReportType.GROUP);
			Report.createStep("Acessar Conta1");
			loginTask.fazerLogin("conta1");
			Report.createStep("Ver extrato Conta1");
			menuTask.menuExtrato();
			Report.createStep("Sair Conta1");
			extratoTask.sairDaConta();
			Report.createStep("Acessar Conta2");
			loginTask.fazerLogin("conta2");
			Report.createStep("Ver extrato Conta2");
			menuTask.menuExtrato();
			Report.createStep("Sair Conta2");
			extratoTask.sairDaConta();
			
			
			Report.createTest("Transferencia Bancaria Conta1 para Conta2", ReportType.GROUP);
			Report.createStep("Acessar Conta1");
			loginTask.fazerLogin("conta1");
			Report.createStep("Fazer transferencia para Conta1");
			menuTask.menuTransferencia();
			transferenciaTask.fazerTransferencia("conta2");//parei aqui
			Report.createStep("Ver extrato Conta1");
			menuTask.menuExtrato();
			Report.createStep("Sair Conta1");
			extratoTask.sairDaConta();
			
			Report.createTest("Transferencia Bancaria Conta2 VALIDAÇÃO", ReportType.GROUP);
			Report.createStep("Acessar Conta2");
			loginTask.fazerLogin("conta2");
			Report.createStep("Ver extrato Conta2");
			menuTask.menuExtrato();
			Report.createStep("Sair Conta2");
			extratoTask.sairDaConta();
			
			
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}

}
