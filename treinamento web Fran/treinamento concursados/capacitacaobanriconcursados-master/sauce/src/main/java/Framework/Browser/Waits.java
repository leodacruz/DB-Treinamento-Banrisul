package Framework.Browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
    
    private WebDriver driver;
    
    public Waits(WebDriver driver) {
        
        this.driver=driver;
    }
    
    public WebElement visibilityOfElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    
    public WebElement loadElement(WebElement element) {
        
        try {
          
            return new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(element));
        
        }catch (WebDriverException e) {
           
            return element;
        }
    }

}
