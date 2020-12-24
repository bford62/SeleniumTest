package page_object;

import application_page_base.NavBot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitLogin;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterValidUserName(){
        NavBot.click(usernameField, "User name input");
        NavBot.sendKeys("username field", usernameField, "Admin");
    }

    public void enterValidPassword(){
        NavBot.click(passwordField, "Password");
        NavBot.sendKeys("password field", passwordField, "1");
    }

    public void enterLogin(){
        NavBot.click(submitLogin, "submit");
    }


}
