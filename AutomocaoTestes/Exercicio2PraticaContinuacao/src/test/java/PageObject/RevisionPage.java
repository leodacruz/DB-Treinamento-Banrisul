package PageObject;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RevisionPage {
	WebDriver driver;
	Waits wait;
	
	public RevisionPage(WebDriver driver) {
		this.driver=driver;
		wait = new Waits(this.driver);
	}
	
	public WebElement getFinishButton() {
		return driver.findElement(By.id("finish"));
	}
	
	
}
