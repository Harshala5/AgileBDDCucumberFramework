Feature: view Add User Role Page
  As an Admin
  I want to navigate to User Roles page from Dashboard page after logging in
  So that I can view list of User Roles


  @userManagementModule
  Scenario: Admin can be able to view User Roles Page
    Given Admin is on the Dashboard page
    When Admin clicks on the 'User Management' tab in Admin module
    Then Admin clicks on 'User Roles' option in drop down menu
    And Admin should view the User Roles page with Add and Delete Buttons

