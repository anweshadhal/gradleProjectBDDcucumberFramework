@APITest
Feature: To validate different APIs for different HTTP methods

  @get
  Scenario Outline: To validate the HTTP get method
    Given user is given with the get method to be automated
    When hit the get method 
    Then validate that the user should get response with the <status>

    Examples: 
      | status |
      |    200 |
