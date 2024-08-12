# new feature
# Tags: optional

Feature: Complete purchase

  @Login
  Scenario Outline: Login in SauceDemo
    Given The user navigates to SauceDemo
    And The user logins with user <username> and password <password>
    And The user clicks on button login
    When The user chooses two items
    And The user views the shopping cart
    Then The user proceeds to checkout
    Then The user completes the information form with name "<first_name>", last name "<last_name>" and Zip Code "<zip_code>"
    And The user sees the bill
    Then The user sees the message "<confirmation_message>"

    Examples:
      | username       | password     | first_name | last_name  | zip_code | confirmation_message |
      | standard_user  | secret_sauce  | Johanna    | Gutierrez  | 170211   | Thanks                    |
