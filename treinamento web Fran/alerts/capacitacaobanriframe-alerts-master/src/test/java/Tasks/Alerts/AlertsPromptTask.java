package Tasks.Alerts;

import org.openqa.selenium.WebDriver;

import PageObjects.Alerts.AlertsPage;
import Validations.Alerts.ValidaAlertPrompt;
import framework.Browser.Waits;

public class AlertsPromptTask {
	
	private WebDriver driver;
	
	private AlertsPage alertsPage;
	
	private Waits wait;
	
	private ValidaAlertPrompt validaAlertPrompt;
	
	public AlertsPromptTask (WebDriver driver) {
		
		this.driver = driver;
	    alertsPage =  new AlertsPage(this.driver);
	    wait= new Waits(this.driver);
	    validaAlertPrompt = new ValidaAlertPrompt(this.driver);
		
	}
	
	public void verificarButtonPrompt() {
		
		alertsPage.getPromptButton().click();
		validaAlertPrompt.validaConfirm();
		alertsPage.getAlert().sendKeys("Banrisul Automation");
		alertsPage.getAlert().accept();
		validaAlertPrompt.validaOKPrompt();
		alertsPage.getPromptButton().click();
		alertsPage.getAlert().dismiss();
		validaAlertPrompt.validaCancelPrompt();
			
	}
	
	

}
