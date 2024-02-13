Feature: Add numbers

  @tag1
  Scenario: Add numbers with given input
    Given user has two numbers 1 and 2
    When the user adds the two numbers
    Then the user should get the result

  Scenario Outline: Add numbers with given input
    Given user has two numbers <Number1> and <Number2>
    When the user adds the two numbers
    Then the user should get the result

    Examples: 
      | Number1 | Number2 |
      |       1 |       1 |
