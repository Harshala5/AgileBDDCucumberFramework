package hr_admin;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static hr_admin.BasePage.driver;

public class AddSkillsStepDefs {
    DashBoardPage dashboardPage = new DashBoardPage();
    SkillsPage skillsPage = new SkillsPage();

    @Given("^Admin is on the Dashboard page$")
    public void viewDashboard() {
         Assert.assertTrue(dashboardPage.verifyUserIsOnDashboardPage());
    }

    @When("^Admin clicks on the 'Admin' module and clicks on the 'Qualifications' tab$")
    public void qualificationTab() {
         skillsPage.adminModTab();
         skillsPage.qualificationTab();
    }

    @And("^Admin selects 'Skills' option from the drop down menu$")
    public void selectSkills() {
        skillsPage.selectSkillsOption();
    }

    @Then("^Admin can view the 'Skills' page$")
    public void verifySkillsPage() {
        Assert.assertTrue(skillsPage.verifySkillsPage());
    }

    @Given("^Admin is in the 'Skills' page$")
    public void skillsPage() {
        Assert.assertTrue(skillsPage.verifySkillsPage());
    }

    @When("^Admin clicks on the 'Add' button$")
    public void addButton() {
        skillsPage.addSkillBtn();
    }

    @And("^Admin enters the 'Add Skill' page$")
    public void verifyAddSkillPage(){
        Assert.assertTrue(skillsPage.verifyAddSkillPage());
    }

    @Then("^Admin enters data into respective 'skill name' and 'description' fields and clicks on Save button$")
    public void skillDataEntry(String skillName, String description) {
         skillsPage.enterSkillName("test analyst1");
         skillsPage.enterDescription("test analyst in agile");
         skillsPage.saveSkill();
    }

    @And("^Admin can view the entered result in the list$")
    public void verifyResult() {
        skillsPage.verifySkillResult();
    }










}
