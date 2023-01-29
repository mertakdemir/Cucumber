package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtil;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {

    HomePage homePage;
    LoginPage loginPage;
    ExcelUtil excelUtil;
    //    will store excel data
    List<Map<String,String>> allTestData;
    //    1. Create a login method
    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage = new HomePage();
        loginPage =new LoginPage();
        try {
            homePage.homePageLoginLink.click();
        }catch (Exception e){
        }
        try{
            homePage.userIcon.click();
            homePage.logoutLink.click();
            homePage.OK.click();
            homePage.homePageLoginLink.click();
        }catch (Exception e){
        }
    }
    @Given("user tries to login as {string}")
    public void user_tries_to_login_as(String sheet) {
        String path = "./src/test/resources/testdata/mysmoketestdata.xlsx";
        String sheetName = sheet;
        excelUtil = new ExcelUtil(path, sheetName);
//        getDataList() method returns all excel data
//        we stored that data in allTestData variable
        allTestData = excelUtil.getDataList();
//        System.out.println(allTestData);
//        System.out.println(excelUtils.getColumnsNames());
//        System.out.println(excelUtils.getCellData(2,1));
//        USING LOOP GET THE VALUES FROM THE MAP AND SEND IN THE UI
        for (Map<String, String> eachData : allTestData) {
//            Takes us to the login page
            login();
            loginPage.username.sendKeys(eachData.get("username"));
            ReusableMethods.waitFor(1);
            loginPage.password.sendKeys(eachData.get("password"));
            ReusableMethods.waitFor(1);
            loginPage.loginButton.click();
            ReusableMethods.waitFor(1);
//            Verify if login is successful
//            IF USER ID IS DISPLAYED THEN LOGIN IS SUCCESSFUL
            Assert.assertTrue(homePage.userIcon.isDisplayed());
        }
    }
    @Then("capture the screenshot")
    public void capture_the_screenshot() throws IOException {
        ReusableMethods.getScreenshot("screenshot");
    }
}
