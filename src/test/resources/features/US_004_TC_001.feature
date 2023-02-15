@alloverCommerceUS04
  Feature: User should be able to add shipping address

    Scenario Outline: US_004_TC_001
      Given user goes to Allover Commerce home page "allover_commerce_url"
      When user clicks on sign in icon
      And user enters email "<email>"
      And user enters password "<password>"
      And user clicks on rememberMe button
      And user clicks on sign in button
      And user clicks on My Account button
      And user clicks on Addresses button
      And user clicks on Add button which belongs to Shipping address
      And user enters the first name for Shipping address "<firstName>"
      And user enters the last name for Shipping address "<lastName>"
      And user enters the company name for Shipping address "<companyName>"
      And user selects country name
      And user enters street name for Shipping address "<streetName>"
      And user enters apartment name for Shipping address "<apartmentName>"
      And user enters city name for Shipping address "<cityName>"
      And user selects province
      And user enters the ZIP Code for Shipping address "<zipCode>"
      And user clicks on save address button
      Then verify the shipping address has been added successfully
      And close the application
      Examples:
        | email | password | firstName | lastName | companyName | streetName | apartmentName | cityName | zipCode |
        | abacada@gmail.com | abacada123! | Mert | Akdemir | techpro | slagsta | hallunda | stockholm | 14573 |
        | abaca@gmail.com | abaca123! | Meliha | Er | cydeo | tre kallors | alby | norsborg | 14574 |

