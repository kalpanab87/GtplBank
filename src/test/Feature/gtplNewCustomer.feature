Feature: To test New Customer Gtpl WebPage
  Scenario: To check the elements visible.
    Given Access Gtpl Bank Manager Home Page
    When I access New Customer in Gtpl Manager Home Page
    Then I see all the elements of the New Customer Webpage

  Scenario Outline: To verify elements of Gtpl page
    Given Access Gtpl Bank Manager Home Page
    When I access New Customer in Gtpl Manager Home Page
    And I access "<customer>","<date>","<address>","<cityname>","<statename>","<pin>","<telephone>","<email>"of the page
    Then I see a pop up
    Examples:
    |customer|date|address|cityname|statename|pin|telephone|email|
    |abcdef|24May2020|ShenleyBrookend|MiltonKeynes|Buckinghamshire|123456|123456|abcd@gmail.com|
    |abc#$123|31May2020|123abc|MiltonKeynes|Buckinghamshire|123456|123456|abcd$#@gmail.com|
