package pages;

import io.cucumber.java.bs.I;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlloverCommerceShippingAddressPage {

    public AlloverCommerceShippingAddressPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "shipping_first_name")
    public WebElement firstNameInput;

    @FindBy(id = "shipping_last_name")
    public WebElement lastNameInput;

    @FindBy(id = "shipping_company")
    public WebElement companyNameInput;

    @FindBy(id = "shipping_country")
    public WebElement countryDropdown;

    @FindBy(id = "shipping_address_1")
    public WebElement streetNameInput;

    @FindBy(id = "shipping_address_2")
    public WebElement apartmentNameInput;

    @FindBy(id = "shipping_city")
    public WebElement cityNameInput;

    @FindBy(id = "shipping_state")
    public WebElement provinceDropdown;

    @FindBy(id = "shipping_postcode")
    public WebElement zipCodeInput;

    @FindBy(xpath = "//button[.='Save address']")
    public WebElement saveAddressButton;
}
