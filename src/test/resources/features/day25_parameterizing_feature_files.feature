@parametrizing1
Feature:Search_Feature

  Background: user_goes_to_google_page
    Given user is on the google home page

    Scenario: TC_01_tesla_search
      When user search for "tesla" on google
      Then verify page title contains "tesla"
      Then close the application

  Scenario: TC_01_tesla_search
    When user search for "nio" on google
    Then verify page title contains "nio"
    Then close the application

  Scenario: TC_01_tesla_search
    When user search for "mercedes" on google
    Then verify page title contains "mercedes"
    Then close the application

  Scenario: TC_01_tesla_search
    When user search for "bmw" on google
    Then verify page title contains "bmw"
    Then close the application

#     "" is used to parametrize feature file