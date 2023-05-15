package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProdutoPage {
    
    private WebDriver driver;
    
    public ProdutoPage(WebDriver driver) {
        
        this.driver= driver;
    }
    
    public WebElement getProdutoLink() {
        
        return driver.findElement(By.id("item_4_title_link"));
    }
    
    public WebElement getAddCartButton() {
        
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
    
    public WebElement getCartButton() {
        
        return driver.findElement(By.className("shopping_cart_link"));
    }  

}
