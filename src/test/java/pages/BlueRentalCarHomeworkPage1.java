package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarHomeworkPage1 {

    public BlueRentalCarHomeworkPage1(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Login']")
    public WebElement loginIcon;

    @FindBy(id = "formBasicEmail")
    public WebElement emailInput;

    @FindBy(id = "formBasicPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userIcon;



}
