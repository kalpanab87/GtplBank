Feature: To verify the Edit Customer Form
  Scenario Outline: To verify the Edit Customer Page
    Given Access Gtpl Bank Manager Home Page
    When I access Edit customer Link
    And I give "<CustomerId>" and submit button
    Then The page goes to next page
    Examples:
    |CustomerId|
    |345690|