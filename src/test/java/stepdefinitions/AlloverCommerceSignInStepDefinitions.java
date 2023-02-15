package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AlloverCommerceHomePage;
import pages.AlloverCommerceMyAccountPage;
import pages.AlloverCommerceShippingAddressPage;
import pages.AlloverCommerceSignInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class AlloverCommerceSignInStepDefinitions {

    AlloverCommerceHomePage alloverCommerceHomePage = new AlloverCommerceHomePage();
    AlloverCommerceSignInPage alloverCommerceSignInPage = new AlloverCommerceSignInPage();
    AlloverCommerceMyAccountPage alloverCommerceMyAccountPage = new AlloverCommerceMyAccountPage();

    AlloverCommerceShippingAddressPage alloverCommerceShippingAddressPage = new AlloverCommerceShippingAddressPage();


    @Given("user goes to Allover Commerce home page {string}")
    public void user_goes_to_allover_commerce_home_page(String URL) {

        Driver.getDriver().get(ConfigReader.getProperty(URL));
    }
    @When("user clicks on sign in icon")
    public void user_clicks_on_sign_in_icon() {
        alloverCommerceHomePage.signInIcon.click();
    }
    @When("user enters email {string}")
    public void user_enters_email(String email) {
        alloverCommerceSignInPage.usernameInput.sendKeys(email);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        alloverCommerceSignInPage.passwordInput.sendKeys(password);
    }
    @When("user clicks on rememberMe button")
    public void user_clicks_on_remember_me_button() {
        alloverCommerceSignInPage.rememberMeCheckBox.click();
    }
    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        alloverCommerceSignInPage.signInButton.click();
    }
    @When("user clicks on My Account button")
    public void user_clicks_on_my_account_button() {
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(alloverCommerceHomePage.myAccountButton);
    }
    @When("user clicks on Addresses button")
    public void user_clicks_on_addresses_button() {
        alloverCommerceMyAccountPage.addressesButton.click();
    }
    @When("user clicks on Add button which belongs to Shipping address")
    public void user_clicks_on_add_button_which_belongs_to_shipping_address() {
        alloverCommerceMyAccountPage.addShippingAddressButton.click();
    }
    @When("user enters the first name for Shipping address {string}")
    public void user_enters_the_first_name_for_shipping_address(String firstName) {
        alloverCommerceShippingAddressPage.firstNameInput.sendKeys(firstName);
    }
    @When("user enters the last name for Shipping address {string}")
    public void user_enters_the_last_name_for_shipping_address(String lastName) {
        alloverCommerceShippingAddressPage.lastNameInput.sendKeys(lastName);
    }
    @When("user enters the company name for Shipping address {string}")
    public void user_enters_the_company_name_for_shipping_address(String companyName) {
        alloverCommerceShippingAddressPage.companyNameInput.sendKeys(companyName);
    }
    @When("user selects country name")
    public void user_selects_country_name() {
        Select countryDD = new Select(alloverCommerceShippingAddressPage.countryDropdown);
        countryDD.selectByVisibleText("South Africa");
    }
    @When("user enters street name for Shipping address {string}")
    public void user_enters_street_name_for_shipping_address(String streetName) {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        alloverCommerceShippingAddressPage.streetNameInput.sendKeys(streetName);
    }
    @When("user enters apartment name for Shipping address {string}")
    public void user_enters_apartment_name_for_shipping_address(String apartmentName) {
        alloverCommerceShippingAddressPage.apartmentNameInput.sendKeys(apartmentName);
    }
    @When("user enters city name for Shipping address {string}")
    public void user_enters_city_name_for_shipping_address(String cityName) {
        alloverCommerceShippingAddressPage.cityNameInput.sendKeys(cityName);
    }
    @When("user selects province")
    public void user_selects_province() {
        Select provinceDD = new Select(alloverCommerceShippingAddressPage.provinceDropdown);
        provinceDD.selectByVisibleText("Limpopo");
    }
    @When("user enters the ZIP Code for Shipping address {string}")
    public void user_enters_the_zip_code_for_shipping_address(String zipCode) {
        alloverCommerceShippingAddressPage.zipCodeInput.sendKeys(zipCode);
    }
    @When("user clicks on save address button")
    public void user_clicks_on_save_address_button() {
        alloverCommerceShippingAddressPage.saveAddressButton.click();
    }
    @Then("verify the shipping address has been added successfully")
    public void verify_the_shipping_address_has_been_added_successfully() {
        ReusableMethods.waitFor(2);
       Assert.assertTrue(alloverCommerceMyAccountPage.editYourShippingAddressButton.isDisplayed());
    }
}
