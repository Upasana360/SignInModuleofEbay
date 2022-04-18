$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/org.login.feature/SignInModule.feature");
formatter.feature({
  "name": "feature to test  the Sign In functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check Sign In is successful or not using valid email and valid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters valid emai id \u0027\u003cvalidemailid\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "user click on the continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user enters valid password \u0027\u003cvalidpassword\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "user click on the Sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "user will Sign in successfully and redirect to home page of ebay",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "validemailid",
        "validpassword"
      ]
    },
    {
      "cells": [
        "upasanamajhi999@gmail.com",
        "Upa@1234"
      ]
    }
  ]
});
formatter.background({
  "name": "user is on Sign in page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the home page \"https://www.ebay.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_is_on_the_home_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Sign In link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_the_Sign_In_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be redirected to the sign in page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_will_be_redirected_to_the_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check Sign In is successful or not using valid email and valid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters valid emai id \u0027upasanamajhi999@gmail.com\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_enters_valid_emai_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid password \u0027Upa@1234\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_enters_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_the_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will Sign in successfully and redirect to home page of ebay",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_will_Sign_in_successfully_and_redirect_to_home_page_of_ebay()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User getting an error message  or not using in valid email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters in valid emai id \u0027\u003cinvalidemailid\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "user click on continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user will get an error message Invalid Email Id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "invalidemailid"
      ]
    },
    {
      "cells": [
        "upasanamajhi"
      ]
    }
  ]
});
formatter.background({
  "name": "user is on Sign in page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the home page \"https://www.ebay.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_is_on_the_home_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Sign In link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_the_Sign_In_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be redirected to the sign in page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_will_be_redirected_to_the_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User getting an error message  or not using in valid email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters in valid emai id \u0027upasanamajhi\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_enters_in_valid_emai_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will get an error message Invalid Email Id",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_will_get_an_error_message_Invalid_Email_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User getting an error message  or not using valid email and in valid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters valid emai id \u0027\u003cvalidemailid\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "user click on the continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user enters invalid password \u0027\u003cvalidemailid\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "user click on the Sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "user will get an error message Either Username or Password is incorrect.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "validemailid",
        "validemailid"
      ]
    },
    {
      "cells": [
        "upasanamajhi999@gmail.com",
        "Upa@12"
      ]
    }
  ]
});
formatter.background({
  "name": "user is on Sign in page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the home page \"https://www.ebay.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_is_on_the_home_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Sign In link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_the_Sign_In_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be redirected to the sign in page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_will_be_redirected_to_the_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User getting an error message  or not using valid email and in valid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters valid emai id \u0027upasanamajhi999@gmail.com\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_enters_valid_emai_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid password \u0027upasanamajhi999@gmail.com\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_enters_invalid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_the_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will get an error message Either Username or Password is incorrect.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_will_get_an_error_message_Either_Username_or_Password_is_incorrect()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "user is on Sign in page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the home page \"https://www.ebay.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_is_on_the_home_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Sign In link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_the_Sign_In_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be redirected to the sign in page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_will_be_redirected_to_the_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check user can not able to Sign in using blank email id",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user left the email id field as blank",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_left_the_email_id_field_as_blank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets an appropriate error message on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_gets_an_appropriate_error_message_on_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Check user can not able to Sign in using valid email id and blank password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters valid emai id \u0027\u003cvalidemailid\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "user click on the continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user left the password field as blank",
  "keyword": "And "
});
formatter.step({
  "name": "user can not able to click on the Sign in button and can not sign in",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "validemailid"
      ]
    },
    {
      "cells": [
        "upasanamajhi999@gmail.com"
      ]
    }
  ]
});
formatter.background({
  "name": "user is on Sign in page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the home page \"https://www.ebay.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_is_on_the_home_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Sign In link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_the_Sign_In_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be redirected to the sign in page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_will_be_redirected_to_the_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check user can not able to Sign in using valid email id and blank password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters valid emai id \u0027upasanamajhi999@gmail.com\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_enters_valid_emai_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_click_on_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user left the password field as blank",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_left_the_password_field_as_blank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can not able to click on the Sign in button and can not sign in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.SignInModule.user_can_not_able_to_click_on_the_Sign_in_button_and_can_not_sign_in()"
});
formatter.result({
  "status": "passed"
});
});