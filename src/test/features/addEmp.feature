Feature: adding a new Employee
  As an Admin
  I want to add a new Employee and save it
  So that I can view the entered result in the Employee list


  @addEmployee
  Scenario: Admin can be able to add a new Employee
    Given Admin is in the 'Add Employee' page
    When Admin enters the Employee name in the respective 3 fields of 'Full Name'
    Then Admin checks the field 'Create Login Details'
    And Admin enters data in 'User Name', 'Password', 'Confirm Password' fields
    Then Admin selects any option in the drop down menu of 'Status' and 'Location' fields and saves it
    And Admin enters into 'Employee Information' page and can view the entered result in the list

