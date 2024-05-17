Feature: Edit Order
  As a user
  I want to log in successfully in the application
  So that I can access my account and able to edit an order

  @EditOrderSuccess
  Scenario: Successfully edit an order choosing a random employee
    Given the user is logged in
    When the user clicks the More Info label from the DashBoard page
    And the user navigates to the Order Details page and clicks on a customer's order
    And the user navigates to the Edit Order page and selects a random employee from the dropdown menu
    And the user clicks on the Save button
    Then the user should be redirected to the Orders page


