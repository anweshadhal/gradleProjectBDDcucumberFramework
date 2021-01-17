@LoginFeature
Feature: feature to test login functionality

  @login
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters the "<userID>" and "<password>"
    And clicks on login button
    Then user should be navigated to the home page

    Examples: 
      | userID                   | password   |
      | anwesha.dhal95@gmail.com | Mamuni1995 |

      
      