package TestCases.Alerts;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Tasks.Alerts.AlertTask;
import Tasks.Alerts.AlertsConfirmTask;
import Tasks.Alerts.AlertsPromptTask;
import Tasks.Alerts.HomeTask;
import framework.TestBase;
import framework.Report.Report;
import framework.Report.ReportType;
import framework.Report.Screenshot;
import framework.Utils.FilesOperation;

public class AlertsJavaScriptTestCase extends TestBase{
	
	private WebDriver driver = this.getDriver();
	
	private static FilesOperation filesOperation = new FilesOperation();
	
	private String PATH = System.getProperty("user.dir") + File.separator + "src" +
	
			File.separator + "main" + File.separator + "resources" + File.separator +
			
			"Properties" + File.separator + "url.properties";
	
	
	private String Properties = "urlAlerts";
	
	private HomeTask homeTask = new HomeTask(this.driver);
	
	private AlertTask alertTask = new AlertTask(this.driver);
	
	private AlertsConfirmTask alertConfirmTask = new AlertsConfirmTask(this.driver);
	
	private AlertsPromptTask alertPromptTask = new AlertsPromptTask(this.driver);
	
	@BeforeEach
	
	public void initialTest() throws IOException {
		
		getDriver().get(filesOperation.getProperties(PATH,Properties));
		
	}
	
	@Test
	
	public void validarAlerts() {
		
		try {
			Report.createTest("Realizar Validações Alerts", ReportType.GROUP);
	        Report.createStep("Validar JavaScript");
	        homeTask.acessarJavaScriptPage();
	        alertTask.verificarButtonAlert();
	        Report.createStep("Validar JavaScript Confirm");
	        alertConfirmTask.verificarButtonConfirm();
	        Report.createStep("Validar JavaScript Prompt");
	        alertPromptTask.verificarButtonPrompt();
	        
	        
		}catch (Exception e) {
			
			
			Report.log(Status.FAIL, e.getMessage(),Screenshot.captureBase64(driver));
			
		}
		
		
		
		
	}
			

}
