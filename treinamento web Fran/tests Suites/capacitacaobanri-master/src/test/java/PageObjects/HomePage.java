package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class HomePage {
	
	
	private WebDriver driver;
	private Waits wait;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new Waits(this.driver);
	}

	
   public WebElement getUserNameInput() {
	   
	   /*WebElement username = driver.findElement(By.id("user-name"));
	   return username;*/
	   
	   return driver.findElement(By.id("user-name"));

   }
   
   public WebElement getPasswordInput() {
	   
	   return driver.findElement(By.id("password"));
	   
   }
	
   public WebElement getLoginButton() {
	   
	   return driver.findElement(By.id("login-button"));
   }
   
   public WebElement getTitle() {
	   
	   return wait.visibilityOfElement(By.xpath("//div[@id='root']/div/div[@class='login_logo']"));
	      
   }
}
