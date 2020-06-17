Feature: To create Mini Statement for the given Account.
  Scenario Outline: : To Verify mini statement account
    Given Access Gtpl Bank Manager Home Page
    When I access mini statement link in gtpl bank home page
    And I enter "<accno>" and click submit in mini statement
    Then I go the mini statement next page
    Examples:
    |accno|
    |45678901|