package PageObjects.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Browser.JavaScriptExecutor;
import framework.Browser.Waits;

public class HomePage {
	
	private WebDriver driver;
	
	private Waits wait;
	
	private JavaScriptExecutor js = new JavaScriptExecutor();
	
	public HomePage (WebDriver driver) {
		
		
		this.driver = driver;
		wait = new Waits(this.driver);
		
	}
	
	public WebElement getLinkFrame() {
		
		WebElement getLinkFrame = wait.visibilityOfElement(By.id("framestest"));
		js.highlight(driver, getLinkFrame);
		return getLinkFrame;
	}
	
	public WebElement getLinkIFrame() {
		
		WebElement getLinkIFrame = wait.visibilityOfElement(By.id("iframestest"));
		js.highlight(driver, getLinkIFrame);
		return getLinkIFrame;
		
	}
	
	
	public WebDriver getFrameDefault() {
		
		return driver.switchTo().defaultContent();
		
	}
	

}
