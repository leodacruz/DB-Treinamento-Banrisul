package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectProductPage {
	
	private WebDriver driver;
	
	public SelectProductPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public WebElement getProductAddButton() {
		
		return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	}
	
	public WebElement getCartButton() {
		
		return driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']"));
	}

}
