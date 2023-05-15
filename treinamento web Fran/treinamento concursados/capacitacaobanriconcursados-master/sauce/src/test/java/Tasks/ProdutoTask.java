package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CartPage;
import PageObjects.ProdutoPage;
import Validations.GenericValidation;

public class ProdutoTask {
    
    private WebDriver driver;
    private ProdutoPage produtoPage;
    private GenericValidation genericValidation;
    private CartPage cartPage;
    
    public ProdutoTask(WebDriver driver) {
        
        this.driver = driver;
        produtoPage = new ProdutoPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        cartPage = new CartPage(this.driver);
    }
    
    public void selecionarProduto() {
        
        genericValidation.validationPages("Products");
        produtoPage.getProdutoLink().click();
        produtoPage.getAddCartButton().click();
        produtoPage.getCartButton().click();
        genericValidation.validationPages("Your Cart");
        genericValidation.validationProduto();
        cartPage.getCheckoutButton().click();
        
    }

}
