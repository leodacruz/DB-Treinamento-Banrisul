package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.Utils.FileOperation;
import PageObjects.CheckoutPage;

public class CheckoutValidation {
	
	private WebDriver driver;
	private CheckoutPage checkoutPage;
	
	public CheckoutValidation(WebDriver driver ) {
		
		this.driver = driver;
		checkoutPage = new CheckoutPage(this.driver);
	}
	
	public void validationForm() {
		
		try {
			
			Assertions.assertFalse(checkoutPage.getFirstNameTextField().getAttribute("value").equalsIgnoreCase(" "));
			Report.log(Status.PASS, "Campos não estão null", Screenshot.captureBase64(driver));
		}catch(Exception e) {
		
			Report.log(Status.FAIL, "Campos não preenchidos" + e.getMessage(), Screenshot.captureBase64(driver));
				}
	}
	
	public void validationCamposForm() {
		
		try {
			
			String name = FileOperation.getProperties("form").getProperty("name");
			String lastName = FileOperation.getProperties("form").getProperty("lastname");
			String zipCode = FileOperation.getProperties("form").getProperty("zip");
			Assertions.assertEquals(name, checkoutPage.getFirstNameTextField().getAttribute("value"));
			Assertions.assertEquals(lastName, checkoutPage.getLastNameTextField().getAttribute("value"));
			Assertions.assertEquals(zipCode, checkoutPage.getZipTextField().getAttribute("value"));
			Report.log(Status.PASS, "O valor dos campos correspondem", Screenshot.captureBase64(driver));
			
		}catch(Exception e) {
		
			Report.log(Status.FAIL, "Campos não preenchidos" + e.getMessage(), Screenshot.captureBase64(driver));
				}
	}

}
