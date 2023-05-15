package Tasks.Alerts;

import org.openqa.selenium.WebDriver;

import PageObjects.Alerts.AlertsPage;
import Validations.Alerts.ValidaAlertConfirm;
import framework.Browser.Waits;

public class AlertsConfirmTask {
	
	
	private WebDriver driver;
	
	private AlertsPage alertsPage;
	
	private Waits wait;
	
	private ValidaAlertConfirm validaAlertConfirm;
	
	
	public AlertsConfirmTask(WebDriver driver) {
		
	    this.driver = driver;
	    alertsPage =  new AlertsPage(this.driver);
	    wait= new Waits(this.driver);  
	    validaAlertConfirm = new ValidaAlertConfirm(this.driver);
	    
	}
	

	public void verificarButtonConfirm() {
		
		alertsPage.getConfirmButton().click();
		validaAlertConfirm.validaConfirm();
		alertsPage.getAlert().accept();
		wait.loadElement(alertsPage.getResultText());
		validaAlertConfirm.validaOKConfirm();
		alertsPage.getConfirmButton().click();
		validaAlertConfirm.validaConfirm();
		alertsPage.getAlert().dismiss();
		validaAlertConfirm.validaCancelConfirm();
		
		
	}
	
	
}
