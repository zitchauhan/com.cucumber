# ------  this is Normal Secanrio Outline example
#Feature: Login Test
#
#Scenario Outline: Successful Login with Valid Credentials
#
#Given User is on Home Page
#
#When User Navigate to Login Page
#
#And User enters "<username>" and "<password>"
#
#Then Message displayed Login Successfully
#
#Examples:
#
#| Username | Password |
#
#| Employee_1 | Welc@345 |
#
#| Employee_2 | Test@542 |
#  Data table example in cucumber
Feature: Login with valid credentials

  Scenario: Successful login with valid credentials
    Given User is on the Login Page
    When User enters Credentials
      | Sharon2023 | Welcome@2023 |
    Then User should see the LMS Home page
