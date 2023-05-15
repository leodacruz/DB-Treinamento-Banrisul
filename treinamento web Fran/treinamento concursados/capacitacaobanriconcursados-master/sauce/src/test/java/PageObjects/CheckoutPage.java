package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    
private WebDriver driver;
    
public CheckoutPage(WebDriver driver) {

    this.driver = driver;
}

    public WebElement getFirstNameInput() {

        return driver.findElement(By.id("first-name"));
    }
    
    public WebElement getLastNameInput() {

        return driver.findElement(By.id("last-name"));
    }
    
    public WebElement getZipCodeInput() {

        return driver.findElement(By.id("postal-code"));
    }
    
    public WebElement getContinueButton() {

        return driver.findElement(By.id("continue"));
    }
    
    public WebElement getFinishButton() {

        return driver.findElement(By.id("finish"));
    }
}
