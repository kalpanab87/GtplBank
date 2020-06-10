Feature: To create new Gtpl Bank Account
  Scenario Outline: To verify the new Gtpl Account Page
    Given Access Gtpl Bank Manager Home Page
    When I access New Account webpage
    And I access the elements "<cusid>","<Ideposit>"
    Then NewAcc page goes to demo guru title
    Examples:
    |cusid|Ideposit|
    |34567|1000|
