package Tasks;

import org.openqa.selenium.WebDriver;

import PageObject.RevisionPage;
import Validations.GenericValidation;


public class RevisionTask {
	private WebDriver driver;
	private RevisionPage revisionPage;
	private GenericValidation genericValidation;

	public RevisionTask(WebDriver driver) {
		this.driver = driver;
		revisionPage = new RevisionPage(this.driver);
		genericValidation = new GenericValidation(this.driver);

	}

	public void revisao() {
		revisionPage.getFinishButton().click();
		genericValidation.validationPageFinal();
		
	}
}
