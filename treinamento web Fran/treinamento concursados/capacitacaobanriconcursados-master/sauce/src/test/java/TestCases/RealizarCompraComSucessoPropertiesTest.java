package TestCases;

import javax.security.auth.login.LoginContext;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Framework.Utils.FileOperation;
import Report.Report;
import Report.ReportType;
import Report.Screenshot;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;
import Validations.CheckoutValidation;

public class RealizarCompraComSucessoPropertiesTest extends TestBase{

    
    private WebDriver driver = getDriverManager();
    
    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    FinishTask finishTask = new FinishTask(driver);
    
    @Test
    @Tag("positivo")
    @Order(2)
    public void realizarCompra() {
        
       // String user= FileOperation.getProperties("user").getProperty("user");
       // String password = FileOperation.getProperties("user").getProperty("password");
       // loginTask.efetuarLoginParametrizado(user, password);
       try {
           Report.createTest("Realizar compra com sucesso Properties", ReportType.GROUP);
           Report.createStep("Realizar Login");
           loginTask.efetuarLoginProperties();
           Report.createStep("Selecionar Produto");
           produtoTask.selecionarProduto();
           Report.createStep("Realizar Checkout");
           checkoutTask.preencherForm2();
           Report.createStep("Finalizar a Compra");
           finishTask.finalizarCompra();
           
       }catch (Exception e) {
       
           Report.log(Status.FAIL, e.getMessage(),Screenshot.capture(driver));
        
           }
       }
}
