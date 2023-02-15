package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObject.FinishPage;

public class FinishValidation {
	private WebDriver driver;
	private Waits wait;
	FinishPage finalPage;

	public FinishValidation(WebDriver driver) {
		this.driver = driver;
		finalPage = new FinishPage(this.driver);
		wait = new Waits(this.driver);
	}

	public void validationFinalPage() {
		try {
			wait.loadElement(finalPage.getLogoGiganteLogo());
			Assertions.assertTrue(finalPage.getLogoGiganteLogo().isDisplayed());
			Report.log(Status.PASS, "Acessou a pagina final", Screenshot.capture(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

	}
}
