@test
Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters LogIn Credentials
      | Username | Password |
      | Admin    | admin123 |
    Then user click on login button
 # Scenario: Successful LogOut
  #  When User LogOut from the Application
   # Then Message displayed LogOut Successfully
