package Tasks.Frames;

import org.openqa.selenium.WebDriver;

import PageObjects.Frames.HomePage;
import Validations.Frames.ValidaFrames;
import Validations.Frames.ValidaIFrames;

public class HomeTask {
	
	private WebDriver driver;
	
	private HomePage homePage;
	
	private ValidaFrames validaFrames;
	
	private ValidaIFrames validaIFrames;
	
	public HomeTask (WebDriver driver) {
		
		this.driver = driver;
	    homePage = new HomePage(this.driver);
	    validaFrames = new ValidaFrames(this.driver);
	    validaIFrames = new ValidaIFrames(this.driver);
	}
	
	
	public void acessarFramePage() {
		
		
		homePage.getLinkFrame().click();
		validaFrames.validaPageFrames();
		homePage.getFrameDefault();
		
	}
	
	public void acessarIFramePage() {
		
		
		homePage.getLinkIFrame().click();
		validaIFrames.validaIFramePage();
		
	}

}
