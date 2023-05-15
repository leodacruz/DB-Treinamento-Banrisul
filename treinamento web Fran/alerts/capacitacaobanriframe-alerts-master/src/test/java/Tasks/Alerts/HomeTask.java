package Tasks.Alerts;

import org.openqa.selenium.WebDriver;

import PageObjects.Alerts.HomePage;
import Validations.Alerts.ValidaPaginaAlerts;

public class HomeTask {
	
	
	private WebDriver driver;
	
	private HomePage homePage;
	
	private ValidaPaginaAlerts validaPageAlerts;
	
	public HomeTask(WebDriver driver) {
		
		this.driver = driver;
		homePage = new HomePage(this.driver);
		validaPageAlerts = new ValidaPaginaAlerts(this.driver);
		
	}
	
	
	
	public void acessarJavaScriptPage() {
		
		homePage.getJavaScriptLink().click();
		validaPageAlerts.validaHomeAlerts();
	}

}
