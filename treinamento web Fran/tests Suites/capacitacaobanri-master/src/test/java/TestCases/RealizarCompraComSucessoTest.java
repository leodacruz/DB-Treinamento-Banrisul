package TestCases;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.HomeTask;
import Tasks.SelectProductTask;

public class RealizarCompraComSucessoTest extends TestBase {
	
	private WebDriver driver = this.getDriverManager();

	HomeTask homeTask = new HomeTask(driver);
	SelectProductTask selectProductTask = new SelectProductTask(driver);
	CheckoutTask checkoutTask = new CheckoutTask(driver);
	FinishTask finishTask = new FinishTask(driver);
	
	@Test
	@Tag("positivo")
	public void realizarCompra()  {
		
		try {
		
			Report.createTest("Realizar Compra com Sucesso", ReportType.GROUP);
			Report.createStep("Realizar Login");
			homeTask.efetuarLogin();
			Report.createStep("Selecionar Produto e Realizar Checkout");
			selectProductTask.selecionarProduto();
			checkoutTask.preencherForm();
			Report.createStep("Finalizar a Compra");
			finishTask.finalizarCompra();
		
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}

}
