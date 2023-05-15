package Tasks.Alerts;

import org.openqa.selenium.WebDriver;

import PageObjects.Alerts.AlertsPage;
import Validations.Alerts.ValidaAlert;
import framework.Browser.Waits;

public class AlertTask {
	
	private WebDriver driver;
	
	private AlertsPage alertsPage;
	
	private Waits wait;
	
	private ValidaAlert validaAlert;
	
	public AlertTask(WebDriver driver) {
		
		this.driver = driver;
		alertsPage = new AlertsPage(this.driver);
		wait= new Waits(this.driver);
		validaAlert = new ValidaAlert(this.driver);
		
	}
	
	
	public void verificarButtonAlert() {
		
		alertsPage.getAlertButton().click();
		validaAlert.validandoPopUp();
		alertsPage.getAlert().accept();
		validaAlert.validaOKPopUp();
		
	}
	
	

}
