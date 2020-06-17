Feature: To view customised gtpl bank statement
  Scenario Outline: : To verify the page elements are visible
    Given Access Gtpl Bank Manager Home Page
    When I access Customised statement page
    Then I view the web "<Elements>" of the page
    Examples:
    |Elements|
    |accountno|
    |loweramt|
    |tranno|

    Scenario Outline: To Verify the page elements of the web page
      Given Access Gtpl Bank Manager Home Page
      When I access the elements "<accno>","<from>","<to>","<ALL>","<NoT>"
      Then I go to the next webpage
      Examples:
      |accno|ALL|NoT|
      |2345678|23500|2|