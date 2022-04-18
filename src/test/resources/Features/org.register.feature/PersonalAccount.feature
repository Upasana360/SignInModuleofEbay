Feature: feature to test  the Register Functionality for  Personal account

  Scenario Outline: Check user can able to register successfully for Personal account
    Given user is on the home page "https://www.ebay.com/"
    When user click on the Register link
    And user enters First Name '<FirstName>'
    And user enters Last Name  '<LastName>'
    And user enters Email '<Emailid>'
    And user enters Password '<Password>'
    And user click on the Register button
    Then user will success fully Registered and Personal account will be created

    Examples: 
      | FirstName | LastName | Emailid                 | Password        |
      | Upasana   | Majhi    | Soubhagini860@gmail.com | Soubhagini@9105 |
