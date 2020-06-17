Feature: To delete an existing Gtpl Account
  Scenario Outline: To Verify the existing account is deleted
    Given Access Gtpl Bank Manager Home Page
    When I access Delete Account link in Home Page
    When I enter "<Accno>" and click submit
    Then I go the next page
    Examples:
    |Accno|
    |34555666|