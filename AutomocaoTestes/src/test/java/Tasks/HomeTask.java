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

	public void efetuarLogin() throws InterruptedException {
		homePage.getUserNameInput().sendKeys("standard_user");
		Thread.sleep(3000);
		homePage.getPasswordInput().sendKeys("secret_sauce");
		Thread.sleep(3000);
		homePage.getLoginButton().click();
		Thread.sleep(3000);
	}

}
