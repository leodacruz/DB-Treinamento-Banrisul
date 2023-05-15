package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	
	private WebDriver driver;
	
	public CartPage (WebDriver driver) {
		
		this.driver = driver;
				
	}
	
	public WebElement getCheckoutButton() {
		
		return driver.findElement(By.id("checkout"));
		
	}

}
