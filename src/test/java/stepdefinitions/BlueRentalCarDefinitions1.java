package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.BlueRentalCarHomeworkPage1;
import utilities.Driver;

public class BlueRentalCarDefinitions1 {

    BlueRentalCarHomeworkPage1 blueRentalCarHomeworkPage1 = new BlueRentalCarHomeworkPage1();
    @Given("user goes to this link : {string}")
    public void user_goes_to_this_link(String string) {
        Driver.getDriver().get(string);
    }
    @Then("user navigates to login page")
    public void user_navigates_to_login_page() {
        blueRentalCarHomeworkPage1.loginIcon.click();
    }
    @Then("enters username : {string}")
    public void enters_username(String string) {
        blueRentalCarHomeworkPage1.emailInput.sendKeys(string);
    }
    @Then("enters password : {string}")
    public void enters_password(String string) {
        blueRentalCarHomeworkPage1.passwordInput.sendKeys(string);
    }
    @Then("click on login button")
    public void click_on_login_button() {
        blueRentalCarHomeworkPage1.loginButton.click();
    }
    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {
        Assert.assertTrue(blueRentalCarHomeworkPage1.userIcon.isDisplayed());
    }
    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }


}
