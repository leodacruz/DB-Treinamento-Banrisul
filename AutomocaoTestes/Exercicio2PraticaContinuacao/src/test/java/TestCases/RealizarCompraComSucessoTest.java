package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.HomeTask;
import Tasks.SelectProductTask;

public class RealizarCompraComSucessoTest extends TestBase {
    private WebDriver driver = this.getDriverManager();
    
	
	HomeTask homeTask = new HomeTask(driver);
	SelectProductTask selectProductTask = new SelectProductTask(driver);
	
	@Test
	public void realizarCompra () throws InterruptedException {
		homeTask.efetuarLogin();
		selectProductTask.selecionarProducts();
	}
}
