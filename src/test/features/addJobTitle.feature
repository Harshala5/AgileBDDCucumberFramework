Feature: adding a new Job Title
  As an Admin
  I want to click on the Add button on Job Titles page
  So that I can add a new Job Title

     @addJobTitle
  Scenario: Admin can be able to add a new job title and save it
    Given Admin is on the JobTitles page
    When Admin clicks on the Add button
    And Admin enters into the add job title page
    Then Admin enters name and description in the respective text fields and selects save button
    And Admin should see the entered result in the Job title table