package Validations.Frames;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.Frames.FramePage;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaFrames {
	
	private WebDriver driver;
	
	private FramePage framePage;
	
	public ValidaFrames(WebDriver driver) {
		
		
		this.driver = driver;
		framePage = new FramePage(this.driver);
			
	}
	
	
	public void validaPageFrames() {
		
		try {
			
			String label = framePage.getTopFrame().getText();
			Assertions.assertEquals("Nested Frames Example", label);
			Report.log(Status.PASS, "Página de frames acessada com sucesso", Screenshot.captureBase64(driver));
		}catch (Exception e) {
			Report.log(Status.FAIL, "Página de frames não foi acessada com sucesso", Screenshot.captureBase64(driver));
		}
		
		
	}
	
	public void validaFrameLeft() {
		
		try {
			
			String label = framePage.getLeftFrame().getText();
			Assertions.assertEquals("Left List Item 1", label);
			Report.log(Status.PASS, "Frame Left Acessado", Screenshot.captureBase64(driver));
		}catch (Exception e) {
			Report.log(Status.FAIL, "Frame Left Acessado não foi acessado", Screenshot.captureBase64(driver));
		}
		
		
	}
	
	public void validaFrameMiddle() {
		
		try {
			
			String label = framePage.getMiddleFrame().getText();
			Assertions.assertEquals("Middle List Item 1", label);
			Report.log(Status.PASS, "Frame Middle Acessado", Screenshot.captureBase64(driver));
		}catch (Exception e) {
			Report.log(Status.FAIL, "Frame Middle Acessado não foi acessado", Screenshot.captureBase64(driver));
		}
		
		
	}
	
	public void validaFrameRight() {
		
		try {
			
			String label = framePage.getRightFrame().getText();
			Assertions.assertEquals("Right List Item 0", label);
			Report.log(Status.PASS, "Frame Right Acessado", Screenshot.captureBase64(driver));
		}catch (Exception e) {
			Report.log(Status.FAIL, "Frame Right Acessado não foi acessado", Screenshot.captureBase64(driver));
		}
		
		
	}
	
	

}
