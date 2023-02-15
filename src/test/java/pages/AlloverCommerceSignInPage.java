package pages;

import io.cucumber.java.bs.I;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlloverCommerceSignInPage {

    public AlloverCommerceSignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "rememberme")
    public WebElement rememberMeCheckBox;

    @FindBy(xpath = "//button[.='Sign In']")
    public WebElement signInButton;

}
