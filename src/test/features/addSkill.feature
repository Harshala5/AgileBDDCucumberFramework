Feature: adding a new Skill
  As an Admin
  I want to add a new Skill along with description
  So that I can save it and can view the entered result in the list

  @addSkill
  Scenario: Admin can be able to add a new skill
    Given Admin is in the 'Skills' page
    When Admin clicks on the 'Add' button
    And Admin enters the 'Add Skill' page
    Then Admin enters data into respective 'skill name' and 'description' fields and clicks on Save button
    And Admin can view the entered result in the list