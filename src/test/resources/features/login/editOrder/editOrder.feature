Feature: Edit Order
  As a user
  I want to log in successfully in the application
  So that I can access my account and able to edit an order


  @EditOrderSuccess
  Scenario: Successfully edit an order with a random employee
    Given the user is logged in to the application
    And the user clicks the More Info label in the Dashboard page
    When the user is on the Order Details page
    And the user clicks on a customer's order
    When the user navigates to the Edit Order page
    And the user selects a random employee from the dropdown menu
    And the user clicks on the Apply Changes button
    Then the user should see a confirmation message