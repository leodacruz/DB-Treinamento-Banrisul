package TestCases.Frames;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Tasks.Frames.HomeTask;
import Tasks.Frames.IFrameTask;
import framework.TestBase;
import framework.Report.Report;
import framework.Report.ReportType;
import framework.Report.Screenshot;
import framework.Utils.FilesOperation;

public class IFramesTestCase extends TestBase{
	
	private WebDriver driver = this.getDriver();
	
	private static FilesOperation filesOperation = new FilesOperation();
	
	private String PATH = System.getProperty("user.dir") + File.separator + "src" +
	
			File.separator + "main" + File.separator + "resources" + File.separator +
			
			"Properties" + File.separator + "url.properties";
	
	
	private String Properties = "urlFrames";
	
	private HomeTask homeTask = new HomeTask(this.driver);
	
	private IFrameTask iFrameTask = new IFrameTask(this.driver);
	

	@BeforeEach
	
	public void initialTest() throws IOException {
		
		getDriver().get(filesOperation.getProperties(PATH,Properties));
		
	}
	
	@Test
	
	public void validarIFrames() {
		
		try {
			
			Report.createTest("Realizar Validações iFrames", ReportType.SINGLE);
	        homeTask.acessarIFramePage();
	        iFrameTask.verificarIFrames();
	       
  
		}catch (Exception e) {
			
			
			Report.log(Status.FAIL, e.getMessage(),Screenshot.captureBase64(driver));
			
		}

		
	}
			

}
