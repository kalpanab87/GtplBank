Feature: To test Edit Account webpage
  Scenario Outline: To verify the elements of Edit Account webpage
    Given Access Gtpl Bank Manager Home Page
    When I access Edit Account in Gtpl Manager Home Page
    And I access "<AccNo>"
    Then Edit Acc goes to demo guru title page
    Examples: