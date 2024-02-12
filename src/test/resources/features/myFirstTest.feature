Feature: this is my fist test

  Scenario: user login is on home page
    Given user launch the browser
    When user is on Home page
    Then user enter the userName and Password
    And user is successfully logged in

  Scenario Outline: user login with multiple credentials
    Given user launch navigate URL
    When user is on home page
    Then user enter credential  <userName> and <passWord>
    And user naviage to user details page

    Examples: 
      | userName       | passWord    |
      | abc@gmail.com  | password123 |
      | abc1@gmail.com | password121 |
      | abc2@gmail.com | password122 |
