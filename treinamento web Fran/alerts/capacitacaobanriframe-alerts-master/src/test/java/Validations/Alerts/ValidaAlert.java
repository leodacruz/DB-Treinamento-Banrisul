package Validations.Alerts;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.Alerts.AlertsPage;
import framework.Browser.Waits;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaAlert {
	
	private WebDriver driver;
	
	private AlertsPage alertsPage;
	
	private Waits wait;
	
	public ValidaAlert(WebDriver driver) {
		
		this.driver = driver;
		alertsPage = new AlertsPage(this.driver);
		wait= new Waits(this.driver);
		
	}
	
	public void validandoPopUp() {
		
		try {
			String message = alertsPage.getAlert().getText();
			Assertions.assertEquals("I am a JS Alert", message);
			Report.log(Status.PASS, "Alert carregado com sucesso: " + message);
			
		}catch (Exception e) {
			Report.log(Status.FAIL, "Alert não carregado " + e.getMessage(), Screenshot.captureBase64(driver));
			}

	}
	
	public void validaOKPopUp() {
		
		try {
			
			wait.loadElement(alertsPage.getResultText());
			String result = alertsPage.getResultText().getText();
			Assertions.assertEquals("You successfully clicked an alert", result);
			Report.log(Status.PASS, "Clicou no ok da PopUp: " + result , Screenshot.captureBase64(driver));
			
		}catch (Exception e) {
			Report.log(Status.FAIL, "Não clicou na PopUp" + e.getMessage(), Screenshot.captureBase64(driver));
			}

	}

}
