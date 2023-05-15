package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExemploXpath {
    
    private WebDriver driver;
    
    public WebElement getValueTable(String palavra) {
        
        return driver.findElement(By.xpath("//div[@class='form-group col-lg-9']/table[@id='tabelaExtrato']/tbody/tr/td[text()='"+palavra+"']"));
    }
    
  /*  getValueTable("Testando Despesa").getText();
    getValueTable("Testando Rceita").click();*/

}
