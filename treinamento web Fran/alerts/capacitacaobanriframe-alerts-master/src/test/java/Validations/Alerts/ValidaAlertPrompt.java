package Validations.Alerts;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.Alerts.AlertsPage;
import framework.Browser.Waits;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaAlertPrompt {
	
	private WebDriver driver;
	
	private AlertsPage alertsPage;
	
	private Waits wait;
	
	public ValidaAlertPrompt (WebDriver driver) {
		
		this.driver = driver;
	    alertsPage =  new AlertsPage(this.driver);
	    wait= new Waits(this.driver);
	
	}
	
	public void validaConfirm() {
		try{
			String message = alertsPage.getAlert().getText();
			Assertions.assertEquals("I am a JS prompt", message);
			Report.log(Status.PASS, "Prompt Carregado com Sucesso : " + message);
		}catch (Exception e) {
			
			Report.log(Status.FAIL, "Prompt não foi carregado" + e.getMessage(), Screenshot.captureBase64(driver));
		}
		
		
	}
	
	public void validaOKPrompt() {
		
		try{
			wait.loadElement(alertsPage.getResultText());
			String message = alertsPage.getResultText().getText();
			Assertions.assertEquals("You entered: Banrisul Automation", message);
			Report.log(Status.PASS, "Clicou OK Prompt : " + message , Screenshot.captureBase64(driver));
		}catch (Exception e) {
			
			Report.log(Status.FAIL, "Não clicou no OK do Prompt " + e.getMessage(), Screenshot.captureBase64(driver));
		}
		
		
	}
	
	public void validaCancelPrompt() {
		
		try{
			wait.loadElement(alertsPage.getResultText());
			String message = alertsPage.getResultText().getText();
			Assertions.assertEquals("You entered: null", message);
			Report.log(Status.PASS, "Clicou Cancel Prompt : " + message , Screenshot.captureBase64(driver));
		}catch (Exception e) {
			
			Report.log(Status.FAIL, "Não clicou no Cancel do Prompt " + e.getMessage(), Screenshot.captureBase64(driver));
		}
		
		
	}
	

}
