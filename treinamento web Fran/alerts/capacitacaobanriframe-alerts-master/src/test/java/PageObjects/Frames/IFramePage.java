package PageObjects.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Browser.JavaScriptExecutor;
import framework.Browser.Waits;

public class IFramePage {
	
	
	private WebDriver driver;
	
	private Waits wait;
	
	private JavaScriptExecutor js = new JavaScriptExecutor();
	
	public IFramePage(WebDriver driver) {

		this.driver = driver;
		wait = new Waits(this.driver);
		
	}
	
	public WebElement getIFrameTitle() {
		
		WebElement getIFrameTitle = wait.visibilityOfElement(By.xpath("//body/div[@class='page-body']/h1"));
		js.highlight(driver, getIFrameTitle);
		return getIFrameTitle;
		
	}
	
	public WebElement getIFrameList() {

		driver.switchTo().frame("thedynamichtml");
		WebElement getIFrameList = wait.visibilityOfElement(By.id("iframe2"));
		js.highlight(driver, getIFrameList);
		return getIFrameList;

	}
	
	public WebElement getIFrameText() {

		driver.switchTo().frame("theheaderhtml");
		WebElement getIFrameText = wait.visibilityOfElement(By.xpath("//body/div[@class='page-body']/div[@class='explanation']/p"));
		js.highlight(driver, getIFrameText);
		return getIFrameText;

	}
	
	public WebElement getIFrameLink() {

		
		WebElement getIFrameLink = wait.visibilityOfElement(By.xpath("//body/div[@class='page-body']/div[@class='page-navigation']/a"));
		js.highlight(driver, getIFrameLink);
		return getIFrameLink;

	}
	
	
	

}
