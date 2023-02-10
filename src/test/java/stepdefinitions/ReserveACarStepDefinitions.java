package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.BlueRentalCarHomeworkPage1;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class ReserveACarStepDefinitions {

    BlueRentalCarHomeworkPage1 blueRentalCarHomeworkPage1 = new BlueRentalCarHomeworkPage1();
    HomePage homePage = new HomePage();
    @When("user login the page")
    public void user_login_the_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalCarHomeworkPage1.loginIcon.click();
        blueRentalCarHomeworkPage1.emailInput.sendKeys(ConfigReader.getProperty("email"));
        blueRentalCarHomeworkPage1.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        blueRentalCarHomeworkPage1.loginButton.click();
    }
    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Assert.assertTrue(homePage.userIcon.isDisplayed());
    }
    @Given("select a car")
    public void select_a_car() {

    }
    @Given("enter pick up field")
    public void enter_pick_up_field() {

    }
    @Given("enter drop off field")
    public void enter_drop_off_field() {

    }
    @Given("click continue reservation")
    public void click_continue_reservation() {

    }
    @Given("verify complete reservation screen pops up")
    public void verify_complete_reservation_screen_pops_up() {

    }
    @Given("enter card number")
    public void enter_card_number() {

    }
    @Given("enter name on the card")
    public void enter_name_on_the_card() {

    }
    @Given("enter expire date and CVC")
    public void enter_expire_date_and_cvc() {

    }
    @Given("checks the agreement")
    public void checks_the_agreement() {

    }
    @Given("click complete reservation")
    public void click_complete_reservation() {

    }
    @Then("verify ‘Reservation created successfully’ pop up")
    public void verify_reservation_created_successfully_pop_up() {

    }
    @Then("navigated to Reservations screen")
    public void navigated_to_reservations_screen() {

    }
    @Then("verify the last reservation is created")
    public void verify_the_last_reservation_is_created() {

    }
    @When("you click on the last reservation")
    public void you_click_on_the_last_reservation() {

    }
    @Then("verify reservation detail page is displayed")
    public void verify_reservation_detail_page_is_displayed() {

    }
    @Then("verify the table has the following fields: Model, Doors, Seats, Luggage, Transmission, Air Conditioning, Fuel Type, Age")
    public void verify_the_table_has_the_following_fields_model_doors_seats_luggage_transmission_air_conditioning_fuel_type_age() {

    }
    @Then("click on bath to reservations")
    public void click_on_bath_to_reservations() {

    }
    @Then("verify Reservations page is displayed")
    public void verify_reservations_page_is_displayed() {

    }
    @Then("click on Home link")
    public void click_on_home_link() {

    }
    @Then("verify the home page is displayed")
    public void verify_the_home_page_is_displayed() {

    }
}
