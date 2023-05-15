package Tasks.Frames;

import org.openqa.selenium.WebDriver;

import PageObjects.Frames.FramePage;
import PageObjects.Frames.HomePage;
import Validations.Frames.ValidaFrames;

public class FrameTask {
	
	private WebDriver driver;
	
	private HomePage homePage;
	
	private FramePage framePage;
	
	private ValidaFrames validaFrames;
	
	public FrameTask (WebDriver driver) {
		
		this.driver = driver;
		homePage = new HomePage(this.driver);
		framePage = new FramePage(this.driver);
		validaFrames = new ValidaFrames(this.driver);
		
	}
	
	
	public void verificarFrames() {
		
		validaFrames.validaFrameLeft();
		homePage.getFrameDefault();
		validaFrames.validaFrameMiddle();
		homePage.getFrameDefault();
		validaFrames.validaFrameRight();
		
	}
	

}
