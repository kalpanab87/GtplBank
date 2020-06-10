Feature: To delete a existing customer acc.
  Scenario Outline: to verify the delete customer webpage
    Given Access Gtpl Bank Manager Home Page
    When I access Delete "<CustomerId>" webpage
    And The browser goes to next window
    Then The Delete webpage navigates next page
    Examples:
    |CustomerId|
    |78999943435|
