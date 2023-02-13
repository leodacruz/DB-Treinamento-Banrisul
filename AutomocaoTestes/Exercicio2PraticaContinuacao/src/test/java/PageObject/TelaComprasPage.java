package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaComprasPage {

	private WebDriver driver;

	public TelaComprasPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLinkPrimeiroItem() {
		return driver.findElement(By.xpath("//a[@id = 'item_4_img_link']/img [@class = 'inventory_item_img']"));
	}
}
