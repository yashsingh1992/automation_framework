Feature: Login with invalid credential

  Scenario: Successful Login with valid credential

    Given Launch browser
    When Open URL "https://intel.trademo.com"
    And Enter username as "yashaswi.singh@trademo.com"
    And Enter password as "55555"
    Then validation to be shown on UI

