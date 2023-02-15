package pages;

import io.cucumber.java.bs.I;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlloverCommerceMyAccountPage {

    public AlloverCommerceMyAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//p[.='Addresses']")
    public WebElement addressesButton;

    @FindBy(xpath = "(//a[.='Add'])[2]")
    public WebElement addShippingAddressButton;

    @FindBy(xpath = "//a[.='Edit Your Shipping Address']")
    public WebElement editYourShippingAddressButton;


}
