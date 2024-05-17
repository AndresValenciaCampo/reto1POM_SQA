Feature: User Login
  As a user
  I want to log in to the application
  So that I can access my account

  Background:
    Given the user open the page demo serenity "https://demo.serenity.is/"

  @LoginSuccess
  Scenario: Successful user login
    When the user enters valid credentials and click Sign in
    Then the user should see the message "Dashboard"