package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;
import PageObjects.LoginPage;
import Validations.LoginValidation;

public class LoginTask {
    
private WebDriver driver;
private LoginPage loginPage;
private LoginValidation loginValidation;
    
    public LoginTask(WebDriver driver) {
        
        this.driver= driver;
        loginPage = new LoginPage(this.driver);
        loginValidation = new LoginValidation(this.driver);
    }
    
    public void efetuarLogin() {
        
        loginValidation.validationLoginPage();
        loginPage.getUserNameInput().sendKeys("standard_user");
        loginPage.getPasswordInput().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();
    }
    
   public void efetuarLoginParametrizado(String user, String password) {
        
        loginValidation.validationLoginPage();
        loginPage.getUserNameInput().sendKeys(user);
        loginPage.getPasswordInput().sendKeys(password);
        loginPage.getLoginButton().click();
    }
   
   public void efetuarLoginProperties() {
       
       loginValidation.validationLoginPage();
       loginPage.getUserNameInput().sendKeys(FileOperation.getProperties("user").getProperty("user"));
       loginPage.getPasswordInput().sendKeys(FileOperation.getProperties("user").getProperty("password"));
       loginPage.getLoginButton().click();
   }


}
