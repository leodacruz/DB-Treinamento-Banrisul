package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObject.InsertInformationsPage;

public class InsertitionInformationsValidation {
	private WebDriver driver;
	private InsertInformationsPage insertPage;

	public InsertitionInformationsValidation(WebDriver driver) {
		this.driver = driver;
		insertPage = new InsertInformationsPage(this.driver);
	}

	public void validationInsertionFisrtName() {
		try {
			Assertions.assertFalse(insertPage.getFisrtNameInsertTextFild().getAttribute("value").equalsIgnoreCase(" "));
			Report.log(Status.PASS, "Inseriu o primeiro nome com sucesso", Screenshot.capture(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

	}

	public void validationInsertionLastName() {
		try {
			Assertions.assertFalse(insertPage.getLastNameInsertTextFild().getAttribute("value").equalsIgnoreCase(" "));
			Report.log(Status.PASS, "Inseriu o last nome com sucesso", Screenshot.capture(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

	}

	public void validationInsertionPostalCode() {
		try {
			Assertions
					.assertFalse(insertPage.getPostalCodeInsertTextFild().getAttribute("value").equalsIgnoreCase(" "));
			Report.log(Status.PASS, "Inseriu o postalCode com sucesso", Screenshot.capture(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

	}

}
