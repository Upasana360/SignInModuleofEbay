Feature: feature to test  the Searching functionality

  Scenario Outline: Check user can able to search  anything according to  requirement specification
    Given user is on the home page "https://www.ebay.com/"
    When user enter '<search>' data
    And user click enter
    And user select the buying format and enter data '<buyoption>'
    And user select the Item location and enter data '<locationoption>'
    And user select the Shipping Option and enter data '<Shippingoption>'
    And user select the Show only item option and enter data '<showonlyoption>'
    Then user gets an appropriate search data according to  requirement specification

    Examples: 
      | search | buyoption    | locationoption | Shippingoption              | showonlyoption |
      | Books  | Under $10.00 | North America  | Free International Shipping | Sold Items     |
