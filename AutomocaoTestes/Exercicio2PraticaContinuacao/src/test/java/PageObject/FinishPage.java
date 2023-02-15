package PageObject;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage {
	private WebDriver driver;
	private Waits wait;

	public FinishPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new Waits(this.driver);
	}

	public WebElement getSanduicheButton() {
		return driver.findElement(By.id("react-burger-menu-btn"));
	}

	public WebElement getLogoutButton() {
		return wait.visibilityOfElemnt(By.xpath("//nav[@class ='bm-item-list']/a[@id='logout_sidebar_link']"));
	}

	// WebElement para validacao
	public WebElement getLogoGiganteLogo() {
		return wait.visibilityOfElemnt(
				By.xpath("//div [@id = 'checkout_complete_container']/img [@class = 'pony_express']"));
	}

}
