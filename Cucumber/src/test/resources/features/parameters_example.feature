Feature: Testing search for some items with parameters and Data Tables

  Scenario: Testing Search for Umbrella on Gigatron
    Given Open Gigatron homepage
    When I click on search field
    And Type 'umbrella'
    Then Page with results is opened

  Scenario: Testing Search for Umbrella on Gigatron with parameters
    Given Open Gigatron homepage
    When I click on search field
    And Type 'umbrella'
    Then Page with results is opened

  Scenario: Testing Search for Pen on Gigatron with parameters
    Given Open Gigatron homepage
    When I click on search field
    And Type 'pen'
    Then Page with results is opened

  Scenario: Testing Search for Pen on Gigatron with parameters
    Given Open Gigatron homepage
    When I click on search field
    And Type 'desk'
    Then Page with results is opened

  Scenario: Testing eBay advanced search with Data Table
    Given Open Ebay advanced search page
    When I advance search an item
      | keyword   | exclude     | min | max |
      | iPhone 11 | refurbished | 300 | 900 |
