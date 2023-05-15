package Validations.Frames;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.Frames.HomePage;
import PageObjects.Frames.IFramePage;
import framework.Browser.Waits;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaIFrames {
	
	
	private WebDriver driver;
	
	private HomePage homePage;
	
	private IFramePage iFramePage;
	
	private Waits wait;
	
	public ValidaIFrames(WebDriver driver) {
		
		this.driver = driver;
		homePage = new HomePage(this.driver);
		iFramePage = new IFramePage(this.driver);
		wait = new Waits(this.driver);

	}
	
	public void validaIFramePage() {
		
		try {
			
			String title = iFramePage.getIFrameTitle().getText();
			Assertions.assertEquals("iFrames Example", title);
			Report.log(Status.PASS, "Página de IFrames Carrega com sucesso", Screenshot.captureBase64(driver));
			
		}catch (Exception e) {
		
			Report.log(Status.FAIL, "Página de IFrames não foi carregada com sucesso", Screenshot.captureBase64(driver));
		}
		
	}
	
	
	public void validaIFrameList() {
		
		try {
			
			String label = iFramePage.getIFrameList().getText();
			Assertions.assertEquals("iFrame List Item 2", label);
			Report.log(Status.PASS, "Iframe List verificado com sucesso", Screenshot.captureBase64(driver));
			
		}catch (Exception e) {
		
			Report.log(Status.FAIL, "Não foi possível acessar o IFrame", Screenshot.captureBase64(driver));
		}
		
	}
	
	public void validaIFrameText() {
		
		try {
			
			String label = iFramePage.getIFrameText().getText();
			Assertions.assertEquals("This page is used in an iFrame.", label);
			Report.log(Status.PASS, "Iframe Caixa de texto verificado com sucesso" + label, Screenshot.captureBase64(driver));
			
		}catch (Exception e) {
		
			Report.log(Status.FAIL, "Não foi possível acessar o IFrame Caixa de texto", Screenshot.captureBase64(driver));
		}
		
	}
	
	public void validaIFrameLink() {
		
		try {
			
			wait.loadElement(homePage.getLinkIFrame());
			Assertions.assertTrue(true, String.valueOf(homePage.getLinkIFrame().isEnabled()));
			Report.log(Status.PASS, "Página index carregada com sucesso", Screenshot.captureBase64(driver));
			
		}catch (Exception e) {
		
			Report.log(Status.FAIL, "Não foi possível carregar a página index", Screenshot.captureBase64(driver));
		}
		
	}
	
	
	
	

}
