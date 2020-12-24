package page_object_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object.LoginPage;

public class LoginTest extends BrowserDriver {

    LoginPage loginPage;

    @BeforeMethod
    public void jackInQuinTechExecute() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void loginExecute() {
        loginPage.enterValidUserName();
        loginPage.enterValidPassword();
        loginPage.enterLogin();
    }
}

