package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.GenericPage;
import Report.Report;
import Report.Screenshot;

public class GenericValidation {

    private WebDriver driver;
    private GenericPage genericPage;
    
    public GenericValidation(WebDriver driver) {
        
        this.driver=driver;
        genericPage = new GenericPage(this.driver);
        
    }
     /*exemplo metodo unico para validacao de cada pagina, 
    teriamos que criar um metodo para cada texto*/
    public void validationPageProducts() {
        
        String label = genericPage.getHomeTextSpan().getText();
        Assertions.assertEquals("Products", label);
    }
    
    
    /*Exemplo de metodo dinamico para validacao das paginas, 
     * onde ira receber por paramentro qual o texto esperado para compacao*/
     
    public void validationPages(String texto) {
       
       try {
           
           String label = genericPage.getHomeTextSpan().getText();
           Assertions.assertEquals(texto, label);
           Report.log(Status.PASS, "A página "+texto+ " foi acessada com sucesso!", Screenshot.captureBase64(driver));
           
       }catch (Exception e) {
           
           Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
    }
       
        
    }
    
    public void validationProduto() {
        try {
            
            Assertions.assertTrue(genericPage.getProdutoLabel().isDisplayed());
            Report.log(Status.PASS, "O produto selecionado esta correto", Screenshot.captureBase64(driver));
        }catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
        
         
     }
}
