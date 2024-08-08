# new feature
# Tags: optional

Feature: Complete purchase

  @Login
  Scenario: Login in SauceDemo
    Given The user navigates to SauceDemo
    And The user logins with user "standard_user" and password "secret_sauce"
    And The user clicks on button login
    When The user chooses two items
    And The user views the shopping cart
    Then The user proceeds to checkout
    Then The user complete the information form with name "Johanna", last name "Gutierrez" and Zip Code "170211"
    And The user sees the bill
    Then The user sees the message "Thank you for your orde   r!"