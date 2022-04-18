Feature: feature to test  the Register Functionality for  Business account

  Scenario Outline: Check user can able to register successfully for Business account
    Given user is on the home page "https://www.ebay.com/"
    When user click on the Register link
    And user choose the Business account radio button
    And user enters the  Business Name '<BusinessName>'
    And user enters the  Business Email ' <BusinessEmail>'
    And user enter the  Password  '<Password>'
    And user enters the  Business Location '<BusinessLocation>'
    And user click on the checkbox I only want to buy on eBay option
    And user click on the BusinessRegister button
    And user enter the otp which is get manually and click the verify button
    Then user will success fully Registered and Business account will be created

    Examples: 
      | BusinessName | BusinessEmail      | Password       | BusinessLocation |
      | upasanmobile | psnmajhi@gmail.com | Soubhagini@994 | India            |
