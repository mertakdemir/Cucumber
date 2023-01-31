@grid_feature
Feature: grid_feature
  @grid_chrome
  Scenario: TC01_running_tests_on_Chrome
    Given user is on the application_url using Chrome
    Then verify the page title contains "Techpro Education"
    Then close the remote driver

    @grid_firefox
    Scenario: TC_02_running_tests_on_Firefox
      Given user is on the application_url using Firefox
      Then verify the page title contains "Techpro Education"
      Then close the remote driver
