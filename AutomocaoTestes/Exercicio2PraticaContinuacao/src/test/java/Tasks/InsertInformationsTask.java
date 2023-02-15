package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FakersGeneration;
import PageObject.InsertInformationsPage;
import Validations.GenericValidation;
import Validations.InsertitionInformationsValidation;

public class InsertInformationsTask {
	private WebDriver driver;
	private InsertInformationsPage insertInformationPage;
	private GenericValidation genericValidation;
	private InsertitionInformationsValidation insertValidation;
	private FakersGeneration fakers;
	
	
	public InsertInformationsTask(WebDriver driver) {
		this.driver=driver;
		insertInformationPage = new InsertInformationsPage(this.driver);
		genericValidation =  new GenericValidation(this.driver);
		insertValidation= new InsertitionInformationsValidation(driver);
	    fakers = new FakersGeneration();
	}
	
	public void insercaoDados() {
		
		insertInformationPage.getFisrtNameInsertTextFild().sendKeys(fakers.getFisrtName());
		insertInformationPage.getLastNameInsertTextFild().sendKeys(fakers.getLastName());
		insertInformationPage.getPostalCodeInsertTextFild().sendKeys(fakers.getZipCode());
		insertValidation.validationInsertionFisrtName();
		insertValidation.validationInsertionLastName();
		insertValidation.validationInsertionPostalCode();
		insertInformationPage.getContinueButton().click();
		genericValidation.validationPageRevision(); //confirma se deu o click
		
		
	}	
}
