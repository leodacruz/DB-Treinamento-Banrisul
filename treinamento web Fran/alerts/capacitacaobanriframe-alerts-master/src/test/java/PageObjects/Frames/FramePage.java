package PageObjects.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Browser.JavaScriptExecutor;
import framework.Browser.Waits;

public class FramePage {
	
	
	private WebDriver driver;
	
	private Waits wait;
	
	private JavaScriptExecutor js = new JavaScriptExecutor();
	
	public FramePage (WebDriver driver) {
		
		this.driver = driver;
		wait = new Waits(this.driver);

	}
	
	
	public WebElement getTopFrame() {
		
		driver.switchTo().frame("top");
		WebElement getFramePageTitle = wait.visibilityOfElement(By.xpath("//body/div[@class='page-body']/h1"));
		js.highlight(driver, getFramePageTitle);
		return getFramePageTitle;
		
	}
	
	public WebElement getLeftFrame() {
		
		driver.switchTo().frame("left");
		WebElement getLeftFrame = wait.visibilityOfElement(By.id("left1"));
		js.highlight(driver, getLeftFrame);
		return getLeftFrame;
		
	}
	
	public WebElement getMiddleFrame() {
		
		driver.switchTo().frame("middle");
		WebElement getMiddleFrame = wait.visibilityOfElement(By.id("middle1"));
		js.highlight(driver, getMiddleFrame);
		return getMiddleFrame;
		
	}
	
	public WebElement getRightFrame() {
		
		driver.switchTo().frame("right");
		WebElement getRightFrame = wait.visibilityOfElement(By.id("right0"));
		js.highlight(driver, getRightFrame);
		return getRightFrame;
		
	}

}
