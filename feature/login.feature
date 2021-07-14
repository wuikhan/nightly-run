Feature: Test the login functionality
  As an authenticated user I should be able to login to the application

  Scenario: Using valid credentials I should be able to login
    Given I open the browser
    And I visit the application
    And I enter valid username
    And I enter valid password
    When I click the login button
    Then I should see the dashboard

  Scenario: Using in-valid credentials I should be able to login
    Given I open the browser
    And I visit the application
    And I enter in-valid username
    And I enter in-valid password
    When I click the login button
    Then I should see the dashboard

  Scenario: Using in-valid credentials I should be able to login scenario two
    Given I open the browser
    And I visit the application
    And I enter in-valid username
    #And I enter in-valid password
    When I click the login button
    Then I should see the dashboard

  Scenario: Using in-valid credentials I should be able to login scenario three
    Given I open the browser
    And I visit the application
    And I enter in-valid username
    #And I enter in-valid password
    When I click the login button
    Then I should see the dashboard
