package Tasks;

import org.openqa.selenium.WebDriver;

import PageObject.HomePage;

public class HomeTask {
	private WebDriver driver;
	private HomePage homePage;

	public HomeTask(WebDriver driver) {
		this.driver = driver;
		this.homePage = new HomePage(this.driver);
	}

	public void efetuarLogin() {
		homePage.getUserNameInput().sendKeys("standard_user");
		homePage.getPasswordInput().sendKeys("secret_sauce");
		homePage.getLoginButton().click();
	}

}
