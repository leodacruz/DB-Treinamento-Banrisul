package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.FinishPage;

public class FinishValidation {
	
	private WebDriver driver;
	private FinishPage finishPage;
	
	public FinishValidation(WebDriver driver) {
		
		this.driver = driver;
		finishPage = new FinishPage(this.driver);
	}
	
	public void validationMessageCompra() {
		
		Assertions.assertEquals("THANK YOU FOR YOUR ORDER", finishPage.getFinishTextLabel().getText());
		
	}

}
