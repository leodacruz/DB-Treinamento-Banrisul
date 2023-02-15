package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Tasks.FinishlTask;
import Tasks.HomeTask;
import Tasks.InsertInformationsTask;
import Tasks.RevisionTask;
import Tasks.SelectProductTask;

public class RealizarCompraComSucessoTest extends TestBase {
	private WebDriver driver = this.getDriverManager();

	HomeTask homeTask = new HomeTask(driver);
	SelectProductTask selectProductTask = new SelectProductTask(driver);
	InsertInformationsTask insertInformationsTask = new InsertInformationsTask(driver);
	RevisionTask revisionTask = new RevisionTask(driver);
	FinishlTask finishTask = new FinishlTask(driver);

	@Test
	public void realizarCompra() {
		try {
			//jornada
			//Report.createTest("Realizar Compra com sucesso", ReportType.SINGLE);
			Report.createTest("Realizar Compra com sucesso", ReportType.GROUP);
			Report.createStep("Realizar login");
			homeTask.efetuarLogin();
			Report.createStep("selecionar produto e fazer checkout");
			selectProductTask.selecionarProducts();
			insertInformationsTask.insercaoDados();
			revisionTask.revisao();
			Report.createStep("Finalizar Compra");
			finishTask.finalTela();

		} catch (Exception e) {

			Report.log(Status.FAIL,e.getMessage(), Screenshot.capture(driver));
		}

	}
}
