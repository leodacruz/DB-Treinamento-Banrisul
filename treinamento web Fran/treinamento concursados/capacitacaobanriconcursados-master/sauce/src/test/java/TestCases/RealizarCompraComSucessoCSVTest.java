package TestCases;



import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RealizarCompraComSucessoCSVTest extends TestBase{

    
    private WebDriver driver = getDriverManager();
    
    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    FinishTask finishTask = new FinishTask(driver);
    
    @ParameterizedTest
    @CsvFileSource(resources = "/CSV/user.csv", numLinesToSkip = 1)
    @Tags({@Tag("regressao"),@Tag("positivo")})
    @Order(4)
    public void realizarCompra(String user, String password) {
        
        loginTask.efetuarLoginParametrizado(user, password);
        produtoTask.selecionarProduto();
        checkoutTask.preencherForm();
        finishTask.finalizarCompra();
        
    }
}
