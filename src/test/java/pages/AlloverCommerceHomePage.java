package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlloverCommerceHomePage {

    public AlloverCommerceHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signInIcon;

    @FindBy(xpath = "(//a[.='My Account'])[1]")
    public WebElement myAccountButton;


}
