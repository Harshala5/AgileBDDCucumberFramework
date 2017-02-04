Feature: Login Feature for OrangeHRM Website
  As an Admin
  I want to see a login page
  So that I can login successfully

    @login
  Scenario: Admin can be able to login with valid user credentials
    Given Admin is on the login page
    When Admin enters username as "Admin" and password as "aediMNjU"
    And Admin clicks on login button
    Then Admin should login succssfully
    And Admin should see a welcome message as "Welcome Admin"