Feature: view Add Employee page
  As an Admin
  I want to navigate to Add Employee page from Dashboard page after logging in
  So that I can view and add an Employee


  @pimModule
  Scenario: Admin can be able to go to Add Employee page
    Given Admin is on the Dashboard page
    When Admin clicks on the PIM Module
    And Admin clicks on the 'Add Employee' tab
    Then Admin can view the 'Add Employee' page