@blue_rental_car1
Feature: Blue_rental_car_homework1

  Scenario Outline: US167854_manager_login_test
    Given user goes to this link : "https://www.bluerentalcars.com/"
    Then user navigates to login page
    And enters username : "<username>"
    And enters password : "<password>"
    And click on login button
    Then verify the login is successful
    And user closes the browser

    Examples: test_datas
    | username                    | password |
    |sam.walker@bluerentalcars.com| c!fas_art|
    |kate.brown@bluerentalcars.com| tad1$Fas|
    |raj.khan@bluerentalcars.com| v7Hg_va^|
    |pam.raymond@bluerentalcars.com| Nga^g6!|