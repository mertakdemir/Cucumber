package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridStepDefinitions {
    WebDriver driver;
    @Given("user is on the application_url using Chrome")
    public void user_is_on_the_application_url_using_chrome() throws MalformedURLException {
        //Selenium Grid URL
        URL remoteURL = new URL("http://192.168.1.151:4444");
        //Create RemoteWebDriver
        driver = new RemoteWebDriver(remoteURL, new ChromeOptions());
        //Grid steps are done... Rest is the same as normal test cases
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techproeducation.com");
    }
    @Then("verify the page title contains {string}")
    public void verify_the_page_title_contains(String string) {
        Assert.assertTrue(driver.getTitle().contains(string));
    }
    @Then("close the remote driver")
    public void close_the_remote_driver() {
        driver.quit();
    }

    @Given("user is on the application_url using Firefox")
    public void user_is_on_the_application_url_using_firefox() throws MalformedURLException {
        //Selenium Grid URL
        URL remoteURL = new URL("http://192.168.1.151:4444");
        //Create RemoteWebDriver
        driver = new RemoteWebDriver(remoteURL, new FirefoxOptions());
        //Grid steps are done... Rest is the same as normal test cases
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techproeducation.com");
    }

}
