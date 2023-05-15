package Tasks.Frames;

import org.openqa.selenium.WebDriver;

import PageObjects.Frames.HomePage;
import PageObjects.Frames.IFramePage;
import Validations.Frames.ValidaIFrames;

public class IFrameTask {
	
	
	private WebDriver driver;
	
	private HomePage homePage;
	
	private IFramePage iFramePage;
	
	private ValidaIFrames validaIFrames;
	
	
	
	public IFrameTask (WebDriver driver) {
		
		
		this.driver = driver;
		homePage = new HomePage(this.driver);
		iFramePage = new IFramePage(this.driver);
		validaIFrames = new ValidaIFrames(this.driver);
		
	}
	
	
	public void verificarIFrames() {
		
		validaIFrames.validaIFrameList();
		homePage.getFrameDefault();
		validaIFrames.validaIFrameText();
		iFramePage.getIFrameLink().click();
		validaIFrames.validaIFrameLink();
	}
	
	
	

}
