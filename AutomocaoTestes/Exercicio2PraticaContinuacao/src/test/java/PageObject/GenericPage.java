package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class GenericPage {

	private WebDriver driver;
	private Waits wait;

	public GenericPage(WebDriver driver) {
		this.driver = driver;
		this.wait= new Waits(this.driver);
	}

	public WebElement getHomeTestSpan() {
		return driver.findElement(
				By.xpath("div[@id='header_container']/div[@class='header_secondary_container']/span[@class='title]"));
	}

	public WebElement getProductLabel() {
		return wait.visibilityOfElemnt(By.id("inventory_item_name"));
		//return driver.findElement(By.id("inventory_item_name"));
	}

}
