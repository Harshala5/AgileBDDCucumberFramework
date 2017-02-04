Feature: adding a new User Role
  As an Admin
  I want to click on the Add button on User Roles page
  So that I can add a new User Role

     @addUserRole
  Scenario: Admin can be able to save a new User Role
    Given Admin is on the User Roles Page
    When Admin clicks on Add button
    And Admin enters into Add User Role page
    Then Admin selects option from drop down in 'Type' field and types 'Name' field and clicks on Save button
    And Admin should the result in the 'User Roles' list
