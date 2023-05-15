package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.HomePage;

public class LoginValidation {
	
	private WebDriver driver;
	private HomePage homePage;
	private Waits wait;
	
	public LoginValidation(WebDriver driver) {
		
		this.driver = driver;
		homePage= new HomePage(this.driver);
		wait = new Waits(this.driver);

	}
	
	public void validationLoginPage() {
		
		try {
			
			wait.loadElement(homePage.getTitle());
			Assertions.assertTrue(homePage.getTitle().isDisplayed());
			Report.log(Status.PASS, "Acessou a pagina de login com sucesso", Screenshot.capture(driver));
			
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

	}
	

}
