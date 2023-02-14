package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectProductPage {
	private WebDriver driver;

	public SelectProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAddToCart() {
		return driver.findElement(By.xpath(
				"//div[@class = 'pricebar']/button [@id = 'add-to-cart-sauce-labs-backpack']"));
	}
	
	public WebElement getBackProducts() {
		return driver.findElement(By.id("back-to-products"));	
	}
	
	public WebElement getRemoveProduct() {
		return driver.findElement(By.id("remove-sauce-labs-backpack"));
	}
	
	public WebElement getCartButton() {
		return driver.findElement(By.xpath("//div[@class = 'shopping_cart_container']/a [@class = 'shopping_cart_link']"));
	}
}
