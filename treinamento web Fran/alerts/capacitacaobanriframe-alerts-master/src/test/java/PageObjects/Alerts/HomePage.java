package PageObjects.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Browser.JavaScriptExecutor;
import framework.Browser.Waits;

public class HomePage {
	
private WebDriver driver;
	
	private Waits wait;
	
	private JavaScriptExecutor js = new JavaScriptExecutor();
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		wait = new Waits(this.driver);
			
		
	}
	
	public WebElement getJavaScriptLink() {
		
		return wait.visibilityOfElement(By.xpath("//div[@id='content']/ul/li/a[@href='/javascript_alerts']"));
		
	}
	
	public WebElement getPageTextLabel() {
		
		
		WebElement getPageTextLabel = wait.visibilityOfElement(By.xpath("//div[@id='content']/div[@class='example']/h3"));
		js.highlight(driver, getPageTextLabel);
		return getPageTextLabel;
		
		
	}

}
