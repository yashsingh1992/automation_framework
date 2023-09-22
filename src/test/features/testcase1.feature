Feature: Login with valid credential

  Scenario Outline: Successful Login with valid credential

    Given Launch browser
    When Open URL "https://intel.trademo.com"
    And Enter username as <email>
    And Enter password as <password>
    And Clicks on Submit button and Confirm
    Then User lands on India Imports shipments

  Examples:
  | email                      | password |
  | yashaswi.singh@trademo.com | 080808 |
  | yashaswi.singh@trademo.com | 555555 |





#  Scenario: Click on data source in the header
#
#    Given User is on India Imports Page
#    When User clicks on the data source drop down
#    And Select the US import data set


