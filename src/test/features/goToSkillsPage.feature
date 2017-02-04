Feature: view Skills page
  As an Admin
  I want to navigate to 'Skills' page from 'Qualifications' drop down menu in Admin module
  So that I can view and Add Skill and save it

  @skillPage
  Scenario: Admin can be able to view 'Skills' page
    Given Admin is on the Dashboard page
    When Admin clicks on the 'Admin' module and clicks on the 'Qualifications' tab
    And Admin selects 'Skills' option from the drop down menu
    Then Admin can view the 'Skills' page
