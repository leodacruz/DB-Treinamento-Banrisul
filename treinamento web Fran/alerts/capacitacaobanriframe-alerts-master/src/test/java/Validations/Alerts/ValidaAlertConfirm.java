package Validations.Alerts;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.Alerts.AlertsPage;
import framework.Browser.Waits;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaAlertConfirm {
	
	private WebDriver driver;
	
	private AlertsPage alertsPage;
	
	private Waits wait;
	
	public ValidaAlertConfirm(WebDriver driver) {
		
		this.driver = driver;
	    alertsPage =  new AlertsPage(this.driver);
	    wait= new Waits(this.driver);
		
	}
	
	public void validaConfirm() {
		try{
			String message = alertsPage.getAlert().getText();
			Assertions.assertEquals("I am a JS Confirm", message);
			Report.log(Status.PASS, "Confirm Carregado com Sucesso : " + message);
		}catch (Exception e) {
			
			Report.log(Status.FAIL, "Confirm não foi carregado" + e.getMessage(), Screenshot.captureBase64(driver));
		}
		
		
	}
	
	public void validaOKConfirm() {
		
		try{
			wait.loadElement(alertsPage.getResultText());
			String message = alertsPage.getResultText().getText();
			Assertions.assertEquals("You clicked: Ok", message);
			Report.log(Status.PASS, "Clicou OK Confirm : " + message , Screenshot.captureBase64(driver));
		}catch (Exception e) {
			
			Report.log(Status.FAIL, "Não clicou no OK do Confirm " + e.getMessage(), Screenshot.captureBase64(driver));
		}
		
		
	}
	
	public void validaCancelConfirm() {
		
		try{
			wait.loadElement(alertsPage.getResultText());
			String message = alertsPage.getResultText().getText();
			Assertions.assertEquals("You clicked: Cancel", message);
			Report.log(Status.PASS, "Clicou Cancel Confirm : " + message , Screenshot.captureBase64(driver));
		}catch (Exception e) {
			
			Report.log(Status.FAIL, "Não clicou no Cancel do Confirm " + e.getMessage(), Screenshot.captureBase64(driver));
		}
		
		
	}
	

}
