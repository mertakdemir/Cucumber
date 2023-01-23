package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class GoogleStepDefinitions {

    GooglePage googlePage;
    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        //WRITE YOUR JAVA CODE
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        try{
            ReusableMethods.waitFor(2);
            googlePage = new GooglePage();
            googlePage.popUpAccept.click();//accept pop up if visible. Catch the error and continue if not visible
        }catch (Exception e){
        }
    }

    @When("user search for iphone")
    public void user_search_for_iphone() {
        googlePage = new GooglePage();
        googlePage.searchBox.sendKeys("iPhone"+ Keys.ENTER);
    }
    @Then("verify page title contains iphone")
    public void verify_page_title_contains_iphone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));

    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @When("user search for TeaPot")
    public void user_search_for_tea_pot() {
        googlePage = new GooglePage();
        googlePage.searchBox.sendKeys("TeaPot"+ Keys.ENTER);
    }
    @Then("verify page title contains TeaPot")
    public void verify_page_title_contains_tea_pot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("TeaPot"));
    }

    @When("user search for {string} on google")
    public void user_search_for_on_google(String string) {
        googlePage = new GooglePage();
        googlePage.searchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("verify page title contains {string}")
    public void verify_page_title_contains(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }



}
