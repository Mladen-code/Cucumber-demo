Feature: Testing Sauce Demo website using Scenario Outline and Examples Table

  Scenario Outline: Check if homepage is opened if users credentials are correct

    Given Open Sauce Demo Homepage
    When I type '<username>' and '<password>'
    And I click on the login button
    Then Home page will be opened

    Examples:

      | username        | password     |
      | standard_user   | secret_sauce |
      | problem_user    | secret_sauce |
      | locked_out_user | secret_sauce |

