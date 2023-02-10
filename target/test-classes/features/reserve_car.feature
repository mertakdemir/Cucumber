@reserve_car
Feature: User should be able to reserve a car
  Scenario: User should be able to reserve a car as customer service profile
    When user login the page
    Given user is on the home page
    And select a car
    And enter pick up field
    And enter drop off field
    And click continue reservation
    And verify complete reservation screen pops up
    And enter card number
    And enter name on the card
    And enter expire date and CVC
    And checks the agreement
    And click complete reservation
    Then verify ‘Reservation created successfully’ pop up
    And navigated to Reservations screen
    And verify the last reservation is created
    When you click on the last reservation
    Then verify reservation detail page is displayed
    And verify the table has the following fields: Model, Doors, Seats, Luggage, Transmission, Air Conditioning, Fuel Type, Age
    And click on bath to reservations
    And verify Reservations page is displayed
    And click on Home link
    Then verify the home page is displayed