Feature: feature to test  the Sign In functionality

  Background: user is on Sign in page
    Given user is on the home page "https://www.ebay.com/"
    When user click on the Sign In link
    Then user will be redirected to the sign in page

  Scenario Outline: Check Sign In is successful or not using valid email and valid password
    When user enters valid emai id '<validemailid>'
    And user click on the continue button
    And user enters valid password '<validpassword>'
    And user click on the Sign in button
    Then user will Sign in successfully and redirect to home page of ebay

    Examples: 
      | validemailid              | validpassword |
      | upasanamajhi999@gmail.com | Upa@1234      |

  Scenario Outline: User getting an error message  or not using in valid email
    When user enters in valid emai id '<invalidemailid>'
    And user click on continue button
    Then user will get an error message Invalid Email Id

    Examples: 
      | invalidemailid |
      | upasanamajhi   |

  Scenario Outline: User getting an error message  or not using valid email and in valid password
    When user enters valid emai id '<validemailid>'
    And user click on the continue button
    And user enters invalid password '<validemailid>'
    And user click on the Sign in button
    Then user will get an error message Either Username or Password is incorrect.

    Examples: 
      | validemailid              | validemailid |
      | upasanamajhi999@gmail.com | Upa@12       |

  Scenario: Check user can not able to Sign in using blank email id
    When user left the email id field as blank
    And user click on the continue button
    Then user gets an appropriate error message on the screen

  Scenario Outline: Check user can not able to Sign in using valid email id and blank password
    When user enters valid emai id '<validemailid>'
    And user click on the continue button
    And user left the password field as blank
    Then user can not able to click on the Sign in button and can not sign in

    Examples: 
      | validemailid              |
      | upasanamajhi999@gmail.com |

  