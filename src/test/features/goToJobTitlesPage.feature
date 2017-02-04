Feature: view Job Title page
  As an Admin
  I want to navigate to Job Titles page from Dashboard page after logging in
  So that I can view list of Job Titles


   @jobModule
  Scenario: Admin can be able to go to Job Titles page
    Given Admin is on the Dashboard page
    When Admin clicks on the 'Job' tab in Admin module
    Then Admin clicks on 'Job Titles' option in drop down menu
    And Admin should view the Job Titles page with Add and Delete Buttons